package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.annotation.JSSet;
import com.zapcloudstudios.furnace.lang.annotation.JSVar;
import com.zapcloudstudios.furnace.lang.api.entity.item.FEntityItem;
import com.zapcloudstudios.furnace.lang.api.nbt.FNBTCompound;

public abstract class FItemStack implements FDatable
{
	@JSVar("item")
	public FItem item;
	
	@JSVar("meta")
	public int meta;
	
	@JSVar("size")
	public int size;
	
	public FItemStack(FItem item, int size, int meta)
	{
		this.item = item;
		this.meta = meta;
		this.size = size;
	}
	
	@JSGet("name")
	public abstract String getName();
	
	@JSSet("name")
	public abstract void setName(String name);
	
	@JSGet("tag")
	public abstract FNBTCompound getTag();
	
	@JSSet("tag")
	public abstract void setTag(FNBTCompound tag);
	
	@JSFunc("makeDrop")
	public abstract FEntityItem createDrop(FWorld world);
}
