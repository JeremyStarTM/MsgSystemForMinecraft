package js.msg.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import js.msg.Main;

public class Msg implements CommandExecutor{

	@SuppressWarnings("null")
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String string, String[] args) {
		
		if(s instanceof Player) {
			
			Player sender = (Player) s;
		
			if(args.length == 0) {

				sender.sendMessage(Main.PREFIX + "§4Fehler. §cDu musst einen Spieler und einen Nachricht eingeben!");
				sender.sendMessage(Main.PREFIX + "§cSyntax: §b" + cmd.getUsage());
				sender.sendMessage("");
				sender.sendMessage(Main.PREFIX + "§4Error. §cYou must enter a player and a message!");
				sender.sendMessage(Main.PREFIX + "§cSyntax: §b" + cmd.getUsage());
			
			} else if(args.length == 1) {

				sender.sendMessage(Main.PREFIX + "§4Fehler. §cDu musst einen Spieler und einen Nachricht eingeben!");
				sender.sendMessage(Main.PREFIX + "§cSyntax: §b" + cmd.getUsage());
				sender.sendMessage("");
				sender.sendMessage(Main.PREFIX + "§4Error. §cYou must enter a player and a message!");
				sender.sendMessage(Main.PREFIX + "§cSyntax: §b" + cmd.getUsage());
			
			} else {

				String sendTo = args[0];
				Player sendToFinal = Bukkit.getPlayer(sendTo);
				
				
				if(sendToFinal != null) {
					
					sender.sendMessage(Main.PREFIX + "§4Fehler. §cDer Spieler '§5" + sendTo + "§c' ist nicht online oder existiert nicht.");
					sender.sendMessage("");
					sender.sendMessage(Main.PREFIX + "§4Error. §cThe Player '§5" + sendTo + "§c dosn't exist or isn't online.");
					
				} else {
					
					String message = "";
					
					for(int i = 1; i < args.length; i++) {
						
						message = message + args[i] + " ";
						
					}
					
					Bukkit.getConsoleSender().sendMessage("§b" + sender + " §8> §b" + sendTo + "§8: §r" + message);
					sender.sendMessage("§b" + sender + " §8> §b" + sendTo + "§8: §r" + message);
					sendToFinal.sendMessage("§b" + sender + " §8> §b" + sendTo + "§8: §r" + message);
					
				}
		
			}
		} else {

			Bukkit.getConsoleSender().sendMessage("§4ERROR. §cOnly players are allowed to perform this command!");
			
		}

		return true;
}
}
