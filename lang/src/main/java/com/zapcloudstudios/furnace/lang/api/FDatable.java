package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public interface FDatable
{
	@JSGet("data")
	public <T> T data();
}
