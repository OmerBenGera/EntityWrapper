package com.ome_r.wildstacker.enchantspatch;

import com.ome_r.wildstacker.enchantspatch.listener.EntityWrapperListener;
import com.ome_r.wildstacker.enchantspatch.nms.NMSAdapter;
import com.ome_r.wildstacker.enchantspatch.reflection.ReflectionUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WildStackerEnchantsPatch extends JavaPlugin {

    private WildStackerEnchantsPatch plugin;
    private NMSAdapter nmsAdapter;

    @Override
    public void onEnable() {
        plugin = this;

        if(loadNMSAdapter()) {
            ReflectionUtil.init();
            getServer().getPluginManager().registerEvents(new EntityWrapperListener(this), this);
        }
    }

    private boolean loadNMSAdapter(){
        String version = getServer().getClass().getPackage().getName().split("\\.")[3];
        try{
            nmsAdapter = (NMSAdapter) Class.forName("com.ome_r.wildstacker.enchantspatch.nms." + version + ".NMSAdapter").newInstance();
            return true;
        }catch(Exception ex){
            log("WildStackerEnchantsPatch doesn't support " + version + " - shutting down...");
            Bukkit.getScheduler().runTask(this, () -> getServer().getPluginManager().disablePlugin(this));
        }

        return false;
    }

    public NMSAdapter getNMSAdapter() {
        return nmsAdapter;
    }

    private void log(final String message){
        plugin.getLogger().info(message);
    }

}
