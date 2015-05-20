package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSFunc;
import com.zapcloudstudios.furnace.lang.api.nbt.FNBTCompound;

public interface FBuilder extends FExtable
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
}
