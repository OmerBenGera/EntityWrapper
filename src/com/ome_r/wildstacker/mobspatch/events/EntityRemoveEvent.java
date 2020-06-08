package com.ome_r.wildstacker.mobspatch.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class EntityRemoveEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final LivingEntity livingEntity;

    public EntityRemoveEvent(LivingEntity livingEntity){
        super(!Bukkit.isPrimaryThread());
        this.livingEntity = livingEntity;
    }

    public LivingEntity getEntity() {
        return livingEntity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
