package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public abstract class FItemBlock extends FItem
{
	@JSGet("block")
	public abstract FBlock block();
}
