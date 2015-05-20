package com.zapcloudstudios.furnace.core.wrap;

import org.mozilla.javascript.WrapFactory;

import com.zapcloudstudios.furnace.core.Furnace;

public class FurnaceWrapFactory extends WrapFactory
{
	public Furnace furnace;
	
	public FurnaceWrapFactory(Furnace furnace)
	{
		this.furnace = furnace;
	}
}
