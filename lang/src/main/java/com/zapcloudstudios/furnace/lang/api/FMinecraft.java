package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;

public interface FMinecraft
{
	@JSGet("players")
	public FPlayer[] getPlayers();
}
