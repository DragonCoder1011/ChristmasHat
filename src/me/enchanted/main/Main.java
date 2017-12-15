package me.enchanted.main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.enchanted.main.commands.Commands;

public class Main extends JavaPlugin {
	
	public ArrayList<String> toggled = new ArrayList<String>();
	
	@Override
	public void onEnable()
	{
		getCommand("christmas").setExecutor(new Commands());
	}

}
