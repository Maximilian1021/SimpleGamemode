package me.maximilian1021.main;


import me.maximilian1021.filemanger.FileManager;
import me.maximilian1021.commands.cmdGM;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    PluginDescriptionFile pdf = this.getDescription(); //Gets plugin.yml
    PluginManager pm = Bukkit.getPluginManager();


    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§aPlugin-Name:§6 " + pdf.getName());
        Bukkit.getConsoleSender().sendMessage("§aVersion: §6" + pdf.getVersion());
        Bukkit.getConsoleSender().sendMessage("§aAuthor: §6" + pdf.getAuthors());
        Bukkit.getConsoleSender().sendMessage("§aWebsite: §6" + pdf.getWebsite());
        registerCommands();
        FileManager.createLanguageFile();

        Bukkit.getConsoleSender().sendMessage("§b-------------");
    }


    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§bDas Plugin §6" + pdf.getName() + "§b wurde §cdeaktiviert");
        Bukkit.getConsoleSender().sendMessage("§b-------------");
    }

    public void registerCommands() {

        getCommand("gm").setExecutor(new cmdGM());

    }


}
