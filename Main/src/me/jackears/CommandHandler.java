package me.jackears;

public class CommandHandler implements CommandExecutor
{
    private final MyPlugin plugin;
 
    // constructor
    public CommandHandler(MyPlugin plugin)
    {
        this.plugin = plugin;  
    }
 
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {  
        if (cmd.getName().equalsIgnoreCase("myfancycommand")) // This is the main command
        { // If the player typed /myfancycommand then do the following... (can be run from console also)
            if (args.length == 0)
            { //no arguments, so help will be displayed as stated in the plugin.yml
                return false;
            }
            if (args.length== 1)
            {
                if (args[0].equalsIgnoreCase("version")) // argument 0 is given and correct (e.g. /myfancycommand version)
                {        
                    sender.sendMessage("This server is running version " + plugin.getDescription().getVersion());
                     // do other stuff here directly or call some methods
                    return true;
                } //END version
            }
            else
            {
                sender.sendMessage("Invalid argument count.");
            }
        }    
        return false; // if false is returned, the help for the command stated in the plugin.yml will be displayed to the player
    }
}
