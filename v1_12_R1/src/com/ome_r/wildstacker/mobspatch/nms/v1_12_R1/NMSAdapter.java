package com.ome_r.wildstacker.mobspatch.nms.v1_12_R1;

import com.ome_r.wildstacker.mobspatch.reflection.Fields;
import net.minecraft.server.v1_12_R1.Entity;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftEntity;

public final class NMSAdapter implements com.ome_r.wildstacker.mobspatch.nms.NMSAdapter {

    @Override
    public void updateBukkitEntity(org.bukkit.entity.Entity bukkitEntity) {
        Entity entity = ((CraftEntity) bukkitEntity).getHandle();
        Fields.ENTITY_BUKKIT_ENTITY.set(entity, EntityWrapper.getEntity((CraftServer) bukkitEntity.getServer(), entity));
    }

}
