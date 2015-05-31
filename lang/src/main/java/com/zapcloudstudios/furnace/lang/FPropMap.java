package com.zapcloudstudios.furnace.lang;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.annotation.JSSet;

public interface FPropMap<T> extends FObject
{
	@JSGet
	public default T get(String id)
	{
		throw new UnsupportedOperationException();
	}
	
	@JSSet
	public default void set(String id, T value)
	{
		throw new UnsupportedOperationException();
	}
}
