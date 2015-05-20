package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public interface FExtable
{
	@JSGet("ext")
	public <T> T ext();
}
