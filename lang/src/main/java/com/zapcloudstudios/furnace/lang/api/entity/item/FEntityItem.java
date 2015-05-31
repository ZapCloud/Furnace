package com.zapcloudstudios.furnace.lang.api.entity.item;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.annotation.JSSet;
import com.zapcloudstudios.furnace.lang.api.entity.FEntity;
import com.zapcloudstudios.furnace.lang.api.item.FItemStack;

public interface FEntityItem extends FEntity
{
	@JSGet("stack")
	public abstract FItemStack getStack();
	
	@JSSet("stack")
	public abstract void setStack(FItemStack stack);
}
