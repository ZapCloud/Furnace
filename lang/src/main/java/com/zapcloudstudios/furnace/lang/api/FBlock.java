package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSConst;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public abstract class FBlock implements FExtable
{
	@JSConst("id")
	public String id;
	
	@JSGet("item")
	public abstract FItem item();
}
