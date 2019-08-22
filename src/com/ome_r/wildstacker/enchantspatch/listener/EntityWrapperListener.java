package com.ome_r.wildstacker.enchantspatch.listener;

import com.ome_r.wildstacker.enchantspatch.WildStackerEnchantsPatch;
import com.ome_r.wildstacker.enchantspatch.events.EntityKillEvent;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.Arrays;

public final class EntityWrapperListener implements Listener {

    private WildStackerEnchantsPatch plugin;

    public EntityWrapperListener(WildStackerEnchantsPatch plugin){
        this.plugin = plugin;
        Bukkit.getScheduler().runTask(plugin, () -> {
            for(World world : Bukkit.getWorlds()){
                for(Chunk chunk : world.getLoadedChunks()){
                    Arrays.stream(chunk.getEntities())
                            .filter(entity -> entity instanceof LivingEntity && !(entity instanceof ArmorStand) && !(entity instanceof Player))
                            .forEach(entity -> plugin.getNMSAdapter().updateBukkitEntity(entity));
                }
            }
        });
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onChunkLoad(ChunkLoadEvent e){
        Arrays.stream(e.getChunk().getEntities())
                .filter(entity -> entity instanceof LivingEntity && !(entity instanceof ArmorStand) && !(entity instanceof Player))
                .forEach(entity -> plugin.getNMSAdapter().updateBukkitEntity(entity));
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onCreatureSpawn(CreatureSpawnEvent e){
        plugin.getNMSAdapter().updateBukkitEntity(e.getEntity());
    }

}
