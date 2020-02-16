package js.msg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import js.msg.registry.RegistryClassEvents;

public class Main extends JavaPlugin{
	
	// CREATE VARIABLES
	// CREATE VARIABLES // PLUGIN VARIABLES
	public static Main INSTANCE;
	public static String PREFIX;
	public static String pluginName;
	public static String pluginVersion;
	public static String pluginBy;
	// CREATE VARIABLES // SERVER VARIABLES
	public static String bukkitServerVersion;
	public static String serverIp;
	public static int serverPort;
	public static String serverIpPlusPort;
	
	
	@Override
	public void onEnable() {
		
		// PLUGIN VARIABLES // SET INSTANCE VALUE
		INSTANCE = this;
		
		// PLUGIN ENABLE PROCESS
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("Loading registry...");
		RegistryClassEvents.loadReg();
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§8-------------------- §bMsgSystem §8--------------------");
		Bukkit.getConsoleSender().sendMessage("§7Plugin name: §b" + Main.pluginName);
		Bukkit.getConsoleSender().sendMessage("§7Plugin version: §b" + Main.pluginVersion);
		Bukkit.getConsoleSender().sendMessage("§7Plugin by: §b" + Main.pluginBy);
		Bukkit.getConsoleSender().sendMessage("§7Plugin state: §aENABLED");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§7Bukkit/Spigot Server Version: §b" + bukkitServerVersion);
		Bukkit.getConsoleSender().sendMessage("§7Server IP: §b" + serverIp);
		Bukkit.getConsoleSender().sendMessage("§7Server Port: §b" + serverPort);
		Bukkit.getConsoleSender().sendMessage("§7Server IP + Port: §b" + serverIpPlusPort);
		Bukkit.getConsoleSender().sendMessage("§8-------------------- §bMsgSystem §8--------------------");
		Bukkit.getConsoleSender().sendMessage("");
		
	}

	@Override
	public void onDisable() {

		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§8-------------------- §bMsgSystem §8--------------------");
		Bukkit.getConsoleSender().sendMessage("§7Plugin name: §b" + Main.pluginName);
		Bukkit.getConsoleSender().sendMessage("§7Plugin version: §b" + Main.pluginVersion);
		Bukkit.getConsoleSender().sendMessage("§7Plugin by: §b" + Main.pluginBy);
		Bukkit.getConsoleSender().sendMessage("§7Plugin state: §4DISABLED");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§7Bukkit/Spigot Server Version: §b" + bukkitServerVersion);
		Bukkit.getConsoleSender().sendMessage("§7Server IP: §b" + serverIp);
		Bukkit.getConsoleSender().sendMessage("§7Server Port: §b" + serverPort);
		Bukkit.getConsoleSender().sendMessage("§7Server IP + Port: §b" + serverIpPlusPort);
		Bukkit.getConsoleSender().sendMessage("§8-------------------- §bMsgSystem §8--------------------");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("Unloading registry...");
		RegistryClassEvents.unloadAll();
		Bukkit.getConsoleSender().sendMessage("");
		
	}
}
