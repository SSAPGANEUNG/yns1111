package kudoserver.kudoserv.antiterror;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Sound;


public final class AntiTerror extends JavaPlugin {

    @EventHandler
    public void onItemPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        if (e.getBlockPlaced().getType().equals(Material.TNT)) {
            if(player.getWorld().getEnvironment() == World.Environment.NETHER) {
                e.setCancelled(false);
            }else {
                player.sendMessage(ChatColor.RED + "이 차원에선 이 아이템을 사용하실수 없습니다");
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                e.setCancelled(true);
            }

            if (e.getBlockPlaced().getType().equals(Material.TNT_MINECART)) {
                if (player.getWorld().getEnvironment() == World.Environment.NETHER) {
                    e.setCancelled(false);
                } else {
                    player.sendMessage(ChatColor.RED + "이 차원에선 이 아이템을 사용하실수 없습니다");
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                    e.setCancelled(true);
                }

                    if (e.getBlockPlaced().getType().equals(Material.RESPAWN_ANCHOR)) {
                        if (player.getWorld().getEnvironment() == World.Environment.NORMAL) {
                            e.setCancelled(false);
                        } else {
                            player.sendMessage(ChatColor.RED + "이 차원에선 이 아이템을 사용하실수 없습니다");
                            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                            e.setCancelled(true);
                        }

                            if (e.getBlockPlaced().getType().equals(Material.RESPAWN_ANCHOR)) {
                                if (player.getWorld().getEnvironment() == World.Environment.NORMAL) {
                                    e.setCancelled(false);
                                } else {
                                    player.sendMessage(ChatColor.RED + "이 차원에선 이 아이템을 사용하실수 없습니다");
                                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                                    e.setCancelled(true);
                                }
                }
            }
        }

    }}}