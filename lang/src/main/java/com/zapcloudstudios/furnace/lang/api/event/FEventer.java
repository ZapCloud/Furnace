package com.zapcloudstudios.furnace.lang.api.event;

import java.util.ArrayList;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSFunc;

public abstract class FEventer implements FObject
{
	public FEventer parent;
	public EventType event;
	public boolean active = true;
	public ArrayList<FEventer> subs = new ArrayList<>();
	
	public FEventer()
	{
	}
	
	public FEventer(EventType event)
	{
		this.event = event;
	}
	
	public FEventer(FEventer parent)
	{
		this.parent = parent;
		if (this.parent != null)
		{
			this.event = this.parent.event;
			this.parent.subs.add(this);
		}
	}
	
	@JSFunc
	public abstract FEventer makeSub();
	
	@JSFunc
	public abstract <T> FEventer makeSub(T quals);
	
	@JSFunc("call")
	public abstract <T> FEventer addCall(T func);
	
	@JSFunc("pause")
	public void pause()
	{
		this.active = false;
	}
	
	@JSFunc("resume")
	public void resume()
	{
		this.active = true;
	}
	
	@JSFunc("stop")
	public void stop()
	{
		if (this.parent != null)
		{
			this.parent.subs.remove(this);
			this.parent = null;
		}
	}
	
	@JSFunc("run")
	public abstract <T> void run(T par);
}
