package com.zapcloudstudios.furnace.lang.api;

import java.util.EnumMap;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.annotation.JSNew;
import com.zapcloudstudios.furnace.lang.annotation.JSNullIsUndef;
import com.zapcloudstudios.furnace.lang.api.entity.FPlayer;
import com.zapcloudstudios.furnace.lang.api.event.EventType;
import com.zapcloudstudios.furnace.lang.api.event.FEventer;

public abstract class FGlobal
{
	public EnumMap<EventType, FEventer> eventers = new EnumMap<>(EventType.class);
	
	@JSGet("players")
	public FPlayer[] getPlayers()
	{
		return this.getMC().getPlayers();
	}
	
	@JSGet("events.%")
	@JSNullIsUndef
	public FEventer event(String type)
	{
		try
		{
			EventType event = EventType.valueOf(type);
			FEventer eventer = this.eventers.get(event);
			if (eventer == null)
			{
				eventer = this.createEventer(event);
				this.eventers.put(event, eventer);
			}
			return eventer;
		}
		catch (IllegalArgumentException e)
		{
			
		}
		return null;
	}
	
	public abstract FEventer createEventer(EventType type);
	
	@JSGet("mc")
	public abstract FMinecraft getMC();
	
	@JSGet("blocks.%")
	@JSNullIsUndef
	public abstract FBlock block(String id);
	
	@JSGet("items.%")
	@JSNullIsUndef
	public abstract FItem item(String id);
	
	@JSGet("format.%")
	@JSNullIsUndef
	public abstract String chatFormatting(String id);
	
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
