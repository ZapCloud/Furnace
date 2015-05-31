package com.zapcloudstudios.furnace.lang.api;

import java.util.EnumMap;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.FPropMap;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.annotation.JSNew;
import com.zapcloudstudios.furnace.lang.annotation.JSNullIsUndef;
import com.zapcloudstudios.furnace.lang.api.block.FBlock;
import com.zapcloudstudios.furnace.lang.api.entity.FPlayer;
import com.zapcloudstudios.furnace.lang.api.event.EventType;
import com.zapcloudstudios.furnace.lang.api.event.FEventer;
import com.zapcloudstudios.furnace.lang.api.item.FItem;
import com.zapcloudstudios.furnace.lang.api.item.FItemStack;

public abstract class FGlobal implements FObject
{
	public EnumMap<EventType, FEventer> eventers = new EnumMap<>(EventType.class);
	
	@JSGet("players")
	public FPlayer[] getPlayers()
	{
		return this.getMC().getPlayers();
	}
	
	@JSGet("events")
	public FPropMap<FEventer> event(String type)
	{
		return new FPropMap<FEventer>()
		{
			@Override
			@JSNullIsUndef
			public FEventer get(String type)
			{
				try
				{
					EventType event = EventType.valueOf(type);
					FEventer eventer = FGlobal.this.eventers.get(event);
					if (eventer == null)
					{
						eventer = FGlobal.this.createEventer(event);
						FGlobal.this.eventers.put(event, eventer);
					}
					return eventer;
				}
				catch (IllegalArgumentException e)
				{
					
				}
				return null;
			}
		};
	}
	
	public abstract FEventer createEventer(EventType type);
	
	@JSGet("mc")
	public abstract FMinecraft getMC();
	
	@JSGet("blocks")
	public abstract FPropMap<FBlock> blocks();
	
	@JSGet("items")
	public abstract FPropMap<FItem> items();
	
	@JSGet("format")
	public abstract FPropMap<String> chatFormatting();
	
	@JSNew("Builder")
	public abstract FBuilder newBuilder();
	
	@JSNew("Eventer")
	public abstract FEventer newEventer();
	
	@JSNew("ItemStack")
	public abstract FItemStack newItemStack(FItem item);
	
	@JSNew("ItemStack")
	public abstract FItemStack newItemStack(FItem item, int size);
	
	@JSNew("ItemStack")
	public abstract FItemStack newItemStack(FItem item, int size, int meta);
}
