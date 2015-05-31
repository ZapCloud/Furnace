package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public interface FDatable extends FObject
{
	@JSGet("data")
	public <T extends Cloneable> T data();
}
