package Leees.Protect;

import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class TryToRideEvent implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEntityEvent e) {
        if (e.getRightClicked() != null && this.checkPlayer(e.getPlayer())) {
            if (!(e.getRightClicked() instanceof Vehicle)) {
                return;
            }

            e.getRightClicked().teleport(e.getPlayer().getLocation().add(0.0D, -256.0D, 0.0D));
            e.getPlayer().kickPlayer("Fuck off homo");
            e.setCancelled(true);
        }

    }

    public boolean checkPlayer(Player p) {
        return p.getWorld().getEnvironment().equals(Environment.THE_END) || Math.abs((int)p.getLocation().getX()) + Math.abs((int)p.getLocation().getZ()) > 5000000;
    }
}
