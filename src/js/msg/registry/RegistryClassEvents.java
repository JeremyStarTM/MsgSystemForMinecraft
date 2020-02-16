package js.msg.registry;

import org.bukkit.Bukkit;

import js.msg.Main;

public class RegistryClassEvents {
	
	// REGISTRY VARIABLES // CREATE VARIABLES

	public static String registryPrefix;
	public static String registryPrefixColor;
	public static String registryVersion;
	
	public static void loadReg() {
		
		// REGISTRY VARIABLES // SET VALUES
		registryPrefix = "[REGISTRY] ";
		registryPrefixColor = "§8[§7REGISTRY§8] §r";
		registryVersion = "1.0.0.0";
		
		loadOthers();
		loadCmds();
		loadListeners();
		
	}
	public static void loadCmds() {
		
		Bukkit.getConsoleSender().sendMessage(registryPrefixColor + "§bTrying loading commands...");
		Bukkit.getPluginCommand("message").setExecutor(new js.msg.commands.Msg());
		Bukkit.getPluginCommand("msgregrl").setExecutor(new js.msg.commands.RegistryReloader());
		
	}
	
	public static void loadListeners() {

		Bukkit.getConsoleSender().sendMessage(registryPrefixColor + "§bTrying loading listeners...");
		Bukkit.getConsoleSender().sendMessage(registryPrefixColor + "§6WARNING. §eNo Listeners are in the list to load. §9:(");
		
	}
	
	public static void loadOthers() {

		Bukkit.getConsoleSender().sendMessage(registryPrefixColor + "§bTrying loading other things....");
		
		// PLUGIN VARIABLES // SET VALUES
		Main.PREFIX = "§8[§bMSG§8] §r";
		Main.pluginName = "MsgSystem";
		Main.pluginVersion = "1.0.0.0";
		Main.pluginBy = "JeremyStar";
		
		// SERVER VARIABLES // SET VALUES
		Main.bukkitServerVersion = Bukkit.getBukkitVersion();
		Main.serverIp = Bukkit.getIp();
		Main.serverPort = Bukkit.getPort();
		Main.serverIpPlusPort = Main.serverIp + ":" + Main.serverPort;
		
	}
	
	public static void reloadReg() {
		
		Bukkit.getConsoleSender().sendMessage(registryPrefixColor + "Unloading registry...");
		unloadAll();
		loadReg();
		
	}
	
	public static void unloadAll() {
		
		registryPrefix = "";
		registryPrefixColor = "";
		registryVersion = "";
		Main.pluginName = "";
		Main.pluginVersion = "";
		Main.pluginBy = "";
		Main.bukkitServerVersion = "";
		Main.serverIp = "";
		Main.serverPort = 0;
		Main.serverIpPlusPort = "0";
		
	}
	
}
