package com.zapcloudstudios.furnace.lang.api.world;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.api.FDatable;
import com.zapcloudstudios.furnace.lang.api.FExtable;
import com.zapcloudstudios.furnace.lang.api.entity.FEntity;

public interface FWorld extends FDatable, FExtable, FObject
{
	@JSFunc("createEntity")
	public FEntity createEntity(String id);
}
