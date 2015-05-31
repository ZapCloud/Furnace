package com.zapcloudstudios.furnace.lang.api.entity;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.api.FDatable;
import com.zapcloudstudios.furnace.lang.api.FExtable;

public interface FEntity extends FDatable, FExtable, FObject
{
	@JSFunc("spawn")
	public void spawn();
}
