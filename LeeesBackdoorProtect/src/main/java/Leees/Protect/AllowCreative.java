package Leees.Protect;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AllowCreative implements CommandExecutor {
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
        if (arg0.isOp()) {
            try {
                arg0.sendMessage("Â§aAdded: " + arg3[0]);
                Main.canCreative.add(Bukkit.getPlayer(arg3[0]).getUniqueId());
                FileUtils.save(new File("plugins/AntiBackdoor/canusecreative.txt"));
                return true;
            } catch (Exception var6) {
                arg0.sendMessage("Â§cOH HELL NAH YALL FORGOT SOMETHIN");
                return false;
            }
        } else {
            arg0.sendMessage("Â§cOH HELL NAH BITCH U CANT DO THAT BOI");
            return false;
        }
    }
}
