package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public interface FExtable extends FObject
{
	@JSGet("ext")
	public <T> T ext();
}
