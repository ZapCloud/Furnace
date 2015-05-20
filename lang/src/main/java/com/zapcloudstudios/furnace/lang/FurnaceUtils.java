package com.zapcloudstudios.furnace.lang;

public class FurnaceUtils
{
	public static String resourceIdToPropertyName(String id)
	{
		if (id.startsWith("minecraft:"))
		{
			return id.substring(id.indexOf(':') + 1);
		}
		return id.replace(':', '$');
	}
}
