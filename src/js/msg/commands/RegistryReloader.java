package js.msg.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import js.msg.Main;
import js.msg.registry.RegistryClassEvents;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class RegistryReloader implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String string, String[] args) {
		
		if(s instanceof Player) {
			
			Player p = (Player) s;
			PermissionUser user = PermissionsEx.getUser(p);
			
			if(s.isOp()) {
				
				s.sendMessage(Main.PREFIX + "§bTrying to reload the §5" + Main.pluginName + " Registry§b...");
				RegistryClassEvents.reloadReg();
				s.sendMessage(Main.PREFIX + "§aReloaded the §5" + Main.pluginName + " Registry§a!");
				
			} else if(user.has("msgsystem.rlreg")) {
				
				s.sendMessage(Main.PREFIX + "§bTrying to reload the §5" + Main.pluginName + " Registry§b...");
				RegistryClassEvents.reloadReg();
				s.sendMessage(Main.PREFIX + "§aReloaded the §5" + Main.pluginName + " Registry§a!");
				
			} else {
				
				s.sendMessage(Main.PREFIX + "§4FEHLER. §cDu hast keine Rechte um diesen Befehl auszuführen!");
				s.sendMessage("");
				s.sendMessage(Main.PREFIX + "§4ERROR. §cYou have no permissions to execute this command!");
				
			}
			
		} else {
			
			Bukkit.getConsoleSender().sendMessage("§4ERROR. §cOnly players are allowed to perform this command!");
			
		}
		
		return true;
	}

}
