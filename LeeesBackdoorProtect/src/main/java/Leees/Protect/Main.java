package Leees.Protect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bukkit.Sound;
import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public static List canCreative = new ArrayList();

    public void onEnable() {
        this.getCommand("allowcreative").setExecutor(new AllowCreative());

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("plugins/AntiBackdoor/canusecreative.txt")));
            br.lines().forEach((s) -> {
                canCreative.add(UUID.fromString(s));
            });
        } catch (FileNotFoundException var2) {
            var2.printStackTrace();
        }

        FileUtils.save(new File("plugins/AntiBackdoor/"));
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getServer().getPluginManager().registerEvents(new TryToRideEvent(), this);
    }

    @EventHandler
    public void dispenseEvent(BlockDispenseEvent event) {
        if (event.getBlock().getType() == Material.DISPENSER) {
            if (event.getItem().getType() == Material.MONSTER_EGG) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.STORAGE_MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.EXPLOSIVE_MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.HOPPER_MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.POWERED_MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.COMMAND_MINECART) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT_ACACIA) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT_BIRCH) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT_DARK_OAK) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT_JUNGLE) {
                event.setCancelled(true);
            }

            if (event.getItem().getType() == Material.BOAT_SPRUCE) {
                event.setCancelled(true);
            }

        }

    }

    @EventHandler
    public void onGamemodeChange(PlayerGameModeChangeEvent event) {
        if (!event.getPlayer().isOp() && !canCreative.contains(event.getPlayer().getUniqueId())) {
            event.getPlayer().setGameMode(GameMode.SURVIVAL);
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.DARK_BLUE + "----------------------------------------------------");
            event.getPlayer().sendMessage(ChatColor.GOLD + "Changing gamemode is not allowed cunt the plugin has texted Leee");
            event.getPlayer().sendMessage(ChatColor.DARK_BLUE + "----------------------------------------------------");
        }

    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {

        if (event.getBlock().getType() == Material.BEDROCK) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.BARRIER) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.ENDER_PORTAL_FRAME) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.MOB_SPAWNER) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");

            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.COMMAND) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.COMMAND_CHAIN) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.COMMAND_REPEATING) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.STRUCTURE_BLOCK) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlock().getType() == Material.STRUCTURE_VOID) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT_ACACIA) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT_BIRCH) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT_DARK_OAK) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT_JUNGLE) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

        if (event.getBlockPlaced().getType() == Material.BOAT_SPRUCE) {
            event.getPlayer().sendMessage(ChatColor.RED + "Don't waste your illegals dumb fuck");
            event.setCancelled(true);
        }

    }

    public void onDisable() {
    }
}
