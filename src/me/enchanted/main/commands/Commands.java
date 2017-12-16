package me.enchanted.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.enchanted.main.Main;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player player = (Player) sender;
		if(player.hasPermission("enchanted.hat"))
		{
			if(!Main.toggled.contains(player.getName())){
				if(cmd.getName().equalsIgnoreCase("christmas"))
				{
					Main.toggled.add(player.getName());
				}
			}else{
				if(cmd.getName().equalsIgnoreCase("christmas"))
				{
					Main.toggled.remove(player.getName());
				}
			}
		}
		return true;
	}
	

}
