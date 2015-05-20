package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.api.entity.FEntity;

public interface FWorld extends FDatable, FExtable
{
	@JSFunc("createEntity")
	public FEntity createEntity(String id);
}
