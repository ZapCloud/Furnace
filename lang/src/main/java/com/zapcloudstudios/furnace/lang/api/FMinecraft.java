package com.zapcloudstudios.furnace.lang.api;

import com.zapcloudstudios.furnace.lang.annotation.JSGet;
import com.zapcloudstudios.furnace.lang.api.entity.FPlayer;

public interface FMinecraft
{
	@JSGet("players")
	public FPlayer[] getPlayers();
}
