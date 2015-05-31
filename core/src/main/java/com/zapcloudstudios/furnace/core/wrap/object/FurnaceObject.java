package com.zapcloudstudios.furnace.core.wrap.object;

import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Wrapper;

import com.zapcloudstudios.furnace.lang.FObject;

public class FurnaceObject implements Wrapper, Scriptable
{
	public FurnaceClass spec;
	public FObject of;
	
	@Override
	public String getClassName()
	{
		if (this.of == null)
		{
			return "null";
		}
		return this.of.name();
	}
	
	@Override
	public Object get(String name, Scriptable start)
	{
		return null;
	}
	
	@Override
	public Object get(int index, Scriptable start)
	{
		return null;
	}
	
	@Override
	public boolean has(String name, Scriptable start)
	{
		return false;
	}
	
	@Override
	public boolean has(int index, Scriptable start)
	{
		return false;
	}
	
	@Override
	public void put(String name, Scriptable start, Object value)
	{
	}
	
	@Override
	public void put(int index, Scriptable start, Object value)
	{
	}
	
	@Override
	public void delete(String name)
	{
	}
	
	@Override
	public void delete(int index)
	{
	}
	
	@Override
	public Scriptable getPrototype()
	{
		return null;
	}
	
	@Override
	public void setPrototype(Scriptable prototype)
	{
	}
	
	@Override
	public Scriptable getParentScope()
	{
		return null;
	}
	
	@Override
	public void setParentScope(Scriptable parent)
	{
	}
	
	@Override
	public Object[] getIds()
	{
		return null;
	}
	
	@Override
	public Object getDefaultValue(Class<?> hint)
	{
		return null;
	}
	
	@Override
	public boolean hasInstance(Scriptable instance)
	{
		return false;
	}
	
	@Override
	public Object unwrap()
	{
		return null;
	}
}
