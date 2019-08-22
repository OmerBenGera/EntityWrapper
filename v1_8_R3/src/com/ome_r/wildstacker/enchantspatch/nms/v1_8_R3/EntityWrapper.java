package com.ome_r.wildstacker.enchantspatch.nms.v1_8_R3;

import com.ome_r.wildstacker.enchantspatch.events.EntityKillEvent;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityAnimal;
import net.minecraft.server.v1_8_R3.EntityBat;
import net.minecraft.server.v1_8_R3.EntityBlaze;
import net.minecraft.server.v1_8_R3.EntityCaveSpider;
import net.minecraft.server.v1_8_R3.EntityChicken;
import net.minecraft.server.v1_8_R3.EntityCow;
import net.minecraft.server.v1_8_R3.EntityCreature;
import net.minecraft.server.v1_8_R3.EntityCreeper;
import net.minecraft.server.v1_8_R3.EntityEnderDragon;
import net.minecraft.server.v1_8_R3.EntityEnderman;
import net.minecraft.server.v1_8_R3.EntityEndermite;
import net.minecraft.server.v1_8_R3.EntityGhast;
import net.minecraft.server.v1_8_R3.EntityGiantZombie;
import net.minecraft.server.v1_8_R3.EntityGolem;
import net.minecraft.server.v1_8_R3.EntityGuardian;
import net.minecraft.server.v1_8_R3.EntityHorse;
import net.minecraft.server.v1_8_R3.EntityIronGolem;
import net.minecraft.server.v1_8_R3.EntityLiving;
import net.minecraft.server.v1_8_R3.EntityMagmaCube;
import net.minecraft.server.v1_8_R3.EntityMonster;
import net.minecraft.server.v1_8_R3.EntityMushroomCow;
import net.minecraft.server.v1_8_R3.EntityOcelot;
import net.minecraft.server.v1_8_R3.EntityPig;
import net.minecraft.server.v1_8_R3.EntityPigZombie;
import net.minecraft.server.v1_8_R3.EntityRabbit;
import net.minecraft.server.v1_8_R3.EntitySheep;
import net.minecraft.server.v1_8_R3.EntitySilverfish;
import net.minecraft.server.v1_8_R3.EntitySkeleton;
import net.minecraft.server.v1_8_R3.EntitySlime;
import net.minecraft.server.v1_8_R3.EntitySnowman;
import net.minecraft.server.v1_8_R3.EntitySpider;
import net.minecraft.server.v1_8_R3.EntitySquid;
import net.minecraft.server.v1_8_R3.EntityTameableAnimal;
import net.minecraft.server.v1_8_R3.EntityVillager;
import net.minecraft.server.v1_8_R3.EntityWitch;
import net.minecraft.server.v1_8_R3.EntityWither;
import net.minecraft.server.v1_8_R3.EntityWolf;
import net.minecraft.server.v1_8_R3.EntityZombie;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftBat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftBlaze;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCaveSpider;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftChicken;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCow;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCreeper;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEnderDragon;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEnderman;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEndermite;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftGhast;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftGiant;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftGuardian;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftHorse;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftIronGolem;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftMagmaCube;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftMushroomCow;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftOcelot;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPig;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPigZombie;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftRabbit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSheep;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSilverfish;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSkeleton;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSlime;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSnowman;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSpider;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSquid;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftVillager;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftWitch;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftWither;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftWolf;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftZombie;

final class EntityWrapper {

    static CraftEntity getEntity(CraftServer server, Entity entity) {
        try {
            if (entity instanceof EntityLiving) {
                if (entity instanceof EntitySquid) {
                    return new CraftSquidWrapper(server, (EntitySquid) entity);
                }

                if (!(entity instanceof EntityCreature)) {
                    if (entity instanceof EntitySlime) {
                        if (entity instanceof EntityMagmaCube) {
                            return new CraftMagmaCubeWrapper(server, (EntityMagmaCube) entity);
                        }

                        return new CraftSlimeWrapper(server, (EntitySlime) entity);
                    }

                    if (entity instanceof EntityGhast) {
                        return new CraftGhastWrapper(server, (EntityGhast) entity);
                    }

                    if (entity instanceof EntityEnderDragon) {
                        return new CraftEnderDragonWrapper(server, (EntityEnderDragon) entity);
                    }

                    if (entity instanceof EntityBat) {
                        return new CraftBatWrapper(server, (EntityBat) entity);
                    }
                }

                if (entity instanceof EntityAnimal) {
                    if (entity instanceof EntityChicken) {
                        return new CraftChickenWrapper(server, (EntityChicken) entity);
                    }

                    if (entity instanceof EntityCow) {
                        if (entity instanceof EntityMushroomCow) {
                            return new CraftMushroomCowWrapper(server, (EntityMushroomCow) entity);
                        }

                        return new CraftCowWrapper(server, (EntityCow) entity);
                    }

                    if (entity instanceof EntityPig) {
                        return new CraftPigWrapper(server, (EntityPig) entity);
                    }

                    if (entity instanceof EntityTameableAnimal) {
                        if (entity instanceof EntityWolf) {
                            return new CraftWolfWrapper(server, (EntityWolf) entity);
                        }

                        if (entity instanceof EntityOcelot) {
                            return new CraftOcelotWrapper(server, (EntityOcelot)entity);
                        }
                    } else {
                        if (entity instanceof EntitySheep) {
                            return new CraftSheepWrapper(server, (EntitySheep) entity);
                        }

                        if (entity instanceof EntityHorse) {
                            return new CraftHorseWrapper(server, (EntityHorse) entity);
                        }

                        if (entity instanceof EntityRabbit) {
                            return new CraftRabbitWrapper(server, (EntityRabbit) entity);
                        }
                    }
                } else {
                    if (entity instanceof EntityMonster) {
                        if (entity instanceof EntityZombie) {
                            if (entity instanceof EntityPigZombie) {
                                return new CraftPigZombieWrapper(server, (EntityPigZombie) entity);
                            }

                            return new CraftZombieWrapper(server, (EntityZombie) entity);
                        }

                        if (entity instanceof EntityCreeper) {
                            return new CraftCreeperWrapper(server, (EntityCreeper) entity);
                        }

                        if (entity instanceof EntityEnderman) {
                            return new CraftEndermanWrapper(server, (EntityEnderman) entity);
                        }

                        if (entity instanceof EntitySilverfish) {
                            return new CraftSilverfishWrapper(server, (EntitySilverfish) entity);
                        }

                        if (entity instanceof EntityGiantZombie) {
                            return new CraftGiantWrapper(server, (EntityGiantZombie) entity);
                        }

                        if (entity instanceof EntitySkeleton) {
                            return new CraftSkeletonWrapper(server, (EntitySkeleton) entity);
                        }

                        if (entity instanceof EntityBlaze) {
                            return new CraftBlazeWrapper(server, (EntityBlaze) entity);
                        }

                        if (entity instanceof EntityWitch) {
                            return new CraftWitchWrapper(server, (EntityWitch) entity);
                        }

                        if (entity instanceof EntityWither) {
                            return new CraftWitherWrapper(server, (EntityWither) entity);
                        }

                        if (entity instanceof EntitySpider) {
                            if (entity instanceof EntityCaveSpider) {
                                return new CraftCaveSpiderWrapper(server, (EntityCaveSpider) entity);
                            }

                            return new CraftSpiderWrapper(server, (EntitySpider) entity);
                        }

                        if (entity instanceof EntityEndermite) {
                            return new CraftEndermiteWrapper(server, (EntityEndermite) entity);
                        }

                        if (entity instanceof EntityGuardian) {
                            return new CraftGuardianWrapper(server, (EntityGuardian) entity);
                        }
                    }

                    if (!(entity instanceof EntityGolem)) {
                        if (entity instanceof EntityVillager) {
                            return new CraftVillagerWrapper(server, (EntityVillager) entity);
                        }
                    }

                    if (entity instanceof EntitySnowman) {
                        return new CraftSnowmanWrapper(server, (EntitySnowman) entity);
                    }

                    if (entity instanceof EntityIronGolem) {
                        return new CraftIronGolemWrapper(server, (EntityIronGolem) entity);
                    }
                }
            }
        }catch(Throwable ignored){}

        return CraftEntity.getEntity(server, entity);
    }

    private static boolean setHealth(CraftLivingEntity livingEntity, double health){
        if(health == 0.0){
            EntityKillEvent entityKillEvent = new EntityKillEvent(livingEntity);
            Bukkit.getPluginManager().callEvent(entityKillEvent);
            if(entityKillEvent.isCancelled())
                return false;
        }

        return true;
    }

    private static class CraftSquidWrapper extends CraftSquid {

        CraftSquidWrapper(CraftServer craftServer, EntitySquid entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftMagmaCubeWrapper extends CraftMagmaCube {

        CraftMagmaCubeWrapper(CraftServer craftServer, EntityMagmaCube entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSlimeWrapper extends CraftSlime {

        CraftSlimeWrapper(CraftServer craftServer, EntitySlime entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftGhastWrapper extends CraftGhast {

        CraftGhastWrapper(CraftServer craftServer, EntityGhast entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftEnderDragonWrapper extends CraftEnderDragon {

        CraftEnderDragonWrapper(CraftServer craftServer, EntityEnderDragon entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftBatWrapper extends CraftBat {

        CraftBatWrapper(CraftServer craftServer, EntityBat entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftChickenWrapper extends CraftChicken {

        CraftChickenWrapper(CraftServer craftServer, EntityChicken entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftMushroomCowWrapper extends CraftMushroomCow {

        CraftMushroomCowWrapper(CraftServer craftServer, EntityMushroomCow entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftCowWrapper extends CraftCow {

        CraftCowWrapper(CraftServer craftServer, EntityCow entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftPigWrapper extends CraftPig {

        CraftPigWrapper(CraftServer craftServer, EntityPig entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftWolfWrapper extends CraftWolf {

        CraftWolfWrapper(CraftServer craftServer, EntityWolf entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSheepWrapper extends CraftSheep {

        CraftSheepWrapper(CraftServer craftServer, EntitySheep entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftRabbitWrapper extends CraftRabbit {

        CraftRabbitWrapper(CraftServer craftServer, EntityRabbit entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftOcelotWrapper extends CraftOcelot {

        CraftOcelotWrapper(CraftServer craftServer, EntityOcelot entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftHorseWrapper extends CraftHorse {

        CraftHorseWrapper(CraftServer craftServer, EntityHorse entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftPigZombieWrapper extends CraftPigZombie {

        CraftPigZombieWrapper(CraftServer craftServer, EntityPigZombie entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftZombieWrapper extends CraftZombie {

        CraftZombieWrapper(CraftServer craftServer, EntityZombie entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftCreeperWrapper extends CraftCreeper {

        CraftCreeperWrapper(CraftServer craftServer, EntityCreeper entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftEndermanWrapper extends CraftEnderman {

        CraftEndermanWrapper(CraftServer craftServer, EntityEnderman entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSilverfishWrapper extends CraftSilverfish {

        CraftSilverfishWrapper(CraftServer craftServer, EntitySilverfish entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftGiantWrapper extends CraftGiant {

        CraftGiantWrapper(CraftServer craftServer, EntityGiantZombie entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSkeletonWrapper extends CraftSkeleton {

        CraftSkeletonWrapper(CraftServer craftServer, EntitySkeleton entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftBlazeWrapper extends CraftBlaze {

        CraftBlazeWrapper(CraftServer craftServer, EntityBlaze entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftWitchWrapper extends CraftWitch {

        CraftWitchWrapper(CraftServer craftServer, EntityWitch entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftWitherWrapper extends CraftWither {

        CraftWitherWrapper(CraftServer craftServer, EntityWither entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftCaveSpiderWrapper extends CraftCaveSpider {

        CraftCaveSpiderWrapper(CraftServer craftServer, EntityCaveSpider entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSpiderWrapper extends CraftSpider {

        CraftSpiderWrapper(CraftServer craftServer, EntitySpider entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftEndermiteWrapper extends CraftEndermite {

        CraftEndermiteWrapper(CraftServer craftServer, EntityEndermite entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftGuardianWrapper extends CraftGuardian {

        CraftGuardianWrapper(CraftServer craftServer, EntityGuardian entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftVillagerWrapper extends CraftVillager {

        CraftVillagerWrapper(CraftServer craftServer, EntityVillager entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSnowmanWrapper extends CraftSnowman {

        CraftSnowmanWrapper(CraftServer craftServer, EntitySnowman entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftIronGolemWrapper extends CraftIronGolem {

        CraftIronGolemWrapper(CraftServer craftServer, EntityIronGolem entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

}
