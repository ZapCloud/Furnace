package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.FObject;
import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.api.block.FBlock;
import com.zapcloudstudios.furnace.lang.api.nbt.FNBTCompound;
import com.zapcloudstudios.furnace.lang.api.world.FWorld;

public interface FBuilder extends FExtable, FObject
{
	@JSFunc("commit")
	public void commit(int x, int y, int z, FWorld world);
	
	@JSFunc("reset")
	public void reset(int x, int y, int z);
	
	@JSFunc("reset")
	public void reset();
	
	@JSFunc("remove")
	public void remove(int x, int y, int z);
	
	@JSFunc("set")
	public void set(int x, int y, int z, FBlock block);
	
	@JSFunc("set")
	public void set(int x, int y, int z, FBlock block, int meta);
	
	@JSFunc("blockData")
	public <T> T data(int x, int y, int z);
	
	@JSFunc("blockExt")
	public <T> T ext(int x, int y, int z);
	
	@JSFunc("setTile")
	public void set(int x, int y, int z, FNBTCompound tile);
	
	@JSFunc("add")
	public default void add(FBuilder other)
	{
		this.add(other, false);
	}
	
	@JSFunc("add")
	public void add(FBuilder other, boolean over);
	
	@JSFunc("add")
	public default void add(int x, int y, int z, FBuilder other)
	{
		this.add(x, y, z, other, false);
	}
	
	@JSFunc("add")
	public void add(int x, int y, int z, FBuilder other, boolean over);
	
	@JSFunc("dup")
	public FBuilder clone();
}
