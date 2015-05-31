package com.zapcloudstudios.furnace.lang.api.item;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.api.block.FBlock;

public abstract class FItemBlock extends FItem
{
	@JSGet("block")
	public abstract FBlock block();
}
