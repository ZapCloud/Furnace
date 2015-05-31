package com.zapcloudstudios.furnace.lang.api.block;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSConst;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.api.FExtable;
import com.zapcloudstudios.furnace.lang.api.item.FItem;

public abstract class FBlock implements FExtable, FObject
{
	@JSConst("id")
	public String id;
	
	@JSGet("item")
	public abstract FItem item();
}
