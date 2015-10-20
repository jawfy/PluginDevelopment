package me.jackears;

public class Main extends JavaPlugin implements Listener {
private CommandHandler comHandler = null;
 
    @Override
    public void onEnable()
    {        
        comHandler = new CommandHandler();
        getCommand("myfancycommand").setExecutor(comHandler);
    }
}
