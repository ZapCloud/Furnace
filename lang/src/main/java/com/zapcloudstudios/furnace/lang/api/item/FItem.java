package com.zapcloudstudios.furnace.lang.api.item;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSConst;
import com.zapcloudstudios.furnace.lang.api.FExtable;

public abstract class FItem implements FExtable, FObject
{
	@JSConst("id")
	public String id;
}
