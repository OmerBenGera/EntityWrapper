package com.ome_r.wildstacker.enchantspatch.nms.v1_13_R2;

import com.ome_r.wildstacker.enchantspatch.events.EntityKillEvent;
import net.minecraft.server.v1_13_R2.Entity;
import net.minecraft.server.v1_13_R2.EntityAnimal;
import net.minecraft.server.v1_13_R2.EntityBat;
import net.minecraft.server.v1_13_R2.EntityBlaze;
import net.minecraft.server.v1_13_R2.EntityCaveSpider;
import net.minecraft.server.v1_13_R2.EntityChicken;
import net.minecraft.server.v1_13_R2.EntityCod;
import net.minecraft.server.v1_13_R2.EntityCow;
import net.minecraft.server.v1_13_R2.EntityCreature;
import net.minecraft.server.v1_13_R2.EntityCreeper;
import net.minecraft.server.v1_13_R2.EntityDolphin;
import net.minecraft.server.v1_13_R2.EntityDrowned;
import net.minecraft.server.v1_13_R2.EntityEnderDragon;
import net.minecraft.server.v1_13_R2.EntityEnderman;
import net.minecraft.server.v1_13_R2.EntityEndermite;
import net.minecraft.server.v1_13_R2.EntityEvoker;
import net.minecraft.server.v1_13_R2.EntityFish;
import net.minecraft.server.v1_13_R2.EntityFlying;
import net.minecraft.server.v1_13_R2.EntityGhast;
import net.minecraft.server.v1_13_R2.EntityGiantZombie;
import net.minecraft.server.v1_13_R2.EntityGolem;
import net.minecraft.server.v1_13_R2.EntityGuardian;
import net.minecraft.server.v1_13_R2.EntityGuardianElder;
import net.minecraft.server.v1_13_R2.EntityHorse;
import net.minecraft.server.v1_13_R2.EntityHorseAbstract;
import net.minecraft.server.v1_13_R2.EntityHorseChestedAbstract;
import net.minecraft.server.v1_13_R2.EntityHorseDonkey;
import net.minecraft.server.v1_13_R2.EntityHorseMule;
import net.minecraft.server.v1_13_R2.EntityHorseSkeleton;
import net.minecraft.server.v1_13_R2.EntityHorseZombie;
import net.minecraft.server.v1_13_R2.EntityIllagerAbstract;
import net.minecraft.server.v1_13_R2.EntityIllagerIllusioner;
import net.minecraft.server.v1_13_R2.EntityIllagerWizard;
import net.minecraft.server.v1_13_R2.EntityIronGolem;
import net.minecraft.server.v1_13_R2.EntityLiving;
import net.minecraft.server.v1_13_R2.EntityLlama;
import net.minecraft.server.v1_13_R2.EntityMagmaCube;
import net.minecraft.server.v1_13_R2.EntityMonster;
import net.minecraft.server.v1_13_R2.EntityMushroomCow;
import net.minecraft.server.v1_13_R2.EntityOcelot;
import net.minecraft.server.v1_13_R2.EntityParrot;
import net.minecraft.server.v1_13_R2.EntityPhantom;
import net.minecraft.server.v1_13_R2.EntityPig;
import net.minecraft.server.v1_13_R2.EntityPigZombie;
import net.minecraft.server.v1_13_R2.EntityPolarBear;
import net.minecraft.server.v1_13_R2.EntityPufferFish;
import net.minecraft.server.v1_13_R2.EntityRabbit;
import net.minecraft.server.v1_13_R2.EntitySalmon;
import net.minecraft.server.v1_13_R2.EntitySheep;
import net.minecraft.server.v1_13_R2.EntityShulker;
import net.minecraft.server.v1_13_R2.EntitySilverfish;
import net.minecraft.server.v1_13_R2.EntitySkeletonAbstract;
import net.minecraft.server.v1_13_R2.EntitySkeletonStray;
import net.minecraft.server.v1_13_R2.EntitySkeletonWither;
import net.minecraft.server.v1_13_R2.EntitySlime;
import net.minecraft.server.v1_13_R2.EntitySnowman;
import net.minecraft.server.v1_13_R2.EntitySpider;
import net.minecraft.server.v1_13_R2.EntitySquid;
import net.minecraft.server.v1_13_R2.EntityTameableAnimal;
import net.minecraft.server.v1_13_R2.EntityTropicalFish;
import net.minecraft.server.v1_13_R2.EntityTurtle;
import net.minecraft.server.v1_13_R2.EntityVex;
import net.minecraft.server.v1_13_R2.EntityVillager;
import net.minecraft.server.v1_13_R2.EntityVindicator;
import net.minecraft.server.v1_13_R2.EntityWaterAnimal;
import net.minecraft.server.v1_13_R2.EntityWitch;
import net.minecraft.server.v1_13_R2.EntityWither;
import net.minecraft.server.v1_13_R2.EntityWolf;
import net.minecraft.server.v1_13_R2.EntityZombie;
import net.minecraft.server.v1_13_R2.EntityZombieHusk;
import net.minecraft.server.v1_13_R2.EntityZombieVillager;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_13_R2.CraftServer;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftBat;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftBlaze;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftCaveSpider;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftChicken;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftCod;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftCow;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftCreeper;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftDolphin;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftDonkey;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftDrowned;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftElderGuardian;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEnderDragon;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEnderman;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEndermite;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEvoker;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftGhast;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftGiant;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftGuardian;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftHorse;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftHusk;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftIllager;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftIllusioner;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftIronGolem;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftLlama;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftMagmaCube;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftMule;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftMushroomCow;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftOcelot;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftParrot;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPhantom;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPig;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPigZombie;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPolarBear;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPufferFish;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftRabbit;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSalmon;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSheep;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftShulker;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSilverfish;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSkeleton;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSkeletonHorse;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSlime;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSnowman;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSpider;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftSquid;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftStray;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftTropicalFish;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftTurtle;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftVex;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftVillager;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftVillagerZombie;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftVindicator;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftWitch;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftWither;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftWitherSkeleton;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftWolf;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftZombie;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftZombieHorse;

final class EntityWrapper {

    static CraftEntity getEntity(CraftServer server, Entity entity) {
        try {
            if (entity instanceof EntityLiving) {
                if (entity instanceof EntityWaterAnimal) {
                    if (entity instanceof EntitySquid) {
                        return new CraftSquidWrapper(server, (EntitySquid) entity);
                    }

                    if (entity instanceof EntityFish) {
                        if (entity instanceof EntityCod) {
                            return new CraftCodWrapper(server, (EntityCod) entity);
                        }

                        if (entity instanceof EntityPufferFish) {
                            return new CraftPufferFishWrapper(server, (EntityPufferFish) entity);
                        }

                        if (entity instanceof EntitySalmon) {
                            return new CraftSalmonWrapper(server, (EntitySalmon) entity);
                        }

                        if (entity instanceof EntityTropicalFish) {
                            return new CraftTropicalFishWrapper(server, (EntityTropicalFish) entity);
                        }
                    }

                    if (entity instanceof EntityDolphin) {
                        return new CraftDolphinWrapper(server, (EntityDolphin) entity);
                    }
                }

                if (!(entity instanceof EntityCreature)) {
                    if (entity instanceof EntitySlime) {
                        if (entity instanceof EntityMagmaCube) {
                            return new CraftMagmaCubeWrapper(server, (EntityMagmaCube) entity);
                        }

                        return new CraftSlimeWrapper(server, (EntitySlime) entity);
                    }

                    if (entity instanceof EntityFlying) {
                        if (entity instanceof EntityGhast) {
                            return new CraftGhastWrapper(server, (EntityGhast) entity);
                        }

                        if (entity instanceof EntityPhantom) {
                            return new CraftPhantomWrapper(server, (EntityPhantom) entity);
                        }
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

                        if (entity instanceof EntityParrot) {
                            return new CraftParrotWrapper(server, (EntityParrot) entity);
                        }
                    } else {
                        if (entity instanceof EntitySheep) {
                            return new CraftSheepWrapper(server, (EntitySheep) entity);
                        }

                        if (!(entity instanceof EntityHorseAbstract)) {
                            if (entity instanceof EntityRabbit) {
                                return new CraftRabbitWrapper(server, (EntityRabbit) entity);
                            }

                            if (entity instanceof EntityPolarBear) {
                                return new CraftPolarBearWrapper(server, (EntityPolarBear) entity);
                            }

                            if (entity instanceof EntityTurtle) {
                                return new CraftTurtleWrapper(server, (EntityTurtle) entity);
                            }
                        }

                        if (entity instanceof EntityHorseChestedAbstract) {
                            if (entity instanceof EntityHorseDonkey) {
                                return new CraftDonkeyWrapper(server, (EntityHorseDonkey) entity);
                            }

                            if (entity instanceof EntityHorseMule) {
                                return new CraftMuleWrapper(server, (EntityHorseMule) entity);
                            }

                            if (entity instanceof EntityLlama) {
                                return new CraftLlamaWrapper(server, (EntityLlama) entity);
                            }
                        } else {
                            if (entity instanceof EntityHorse) {
                                return new CraftHorseWrapper(server, (EntityHorse) entity);
                            }

                            if (entity instanceof EntityHorseSkeleton) {
                                return new CraftSkeletonHorseWrapper(server, (EntityHorseSkeleton) entity);
                            }

                            if (entity instanceof EntityHorseZombie) {
                                return new CraftZombieHorseWrapper(server, (EntityHorseZombie) entity);
                            }
                        }
                    }
                } else {
                    if (entity instanceof EntityMonster) {
                        if (entity instanceof EntityZombie) {
                            if (entity instanceof EntityPigZombie) {
                                return new CraftPigZombieWrapper(server, (EntityPigZombie) entity);
                            }

                            if (entity instanceof EntityZombieHusk) {
                                return new CraftHuskWrapper(server, (EntityZombieHusk) entity);
                            }

                            if (entity instanceof EntityZombieVillager) {
                                return new CraftVillagerZombieWrapper(server, (EntityZombieVillager) entity);
                            }

                            if (entity instanceof EntityDrowned) {
                                return new CraftDrownedWrapper(server, (EntityDrowned) entity);
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

                        if (entity instanceof EntitySkeletonAbstract) {
                            if (entity instanceof EntitySkeletonStray) {
                                return new CraftStrayWrapper(server, (EntitySkeletonStray) entity);
                            }

                            if (entity instanceof EntitySkeletonWither) {
                                return new CraftWitherSkeletonWrapper(server, (EntitySkeletonWither) entity);
                            }

                            return new CraftSkeletonWrapper(server, (EntitySkeletonAbstract) entity);
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
                            if (entity instanceof EntityGuardianElder) {
                                return new CraftElderGuardianWrapper(server, (EntityGuardianElder) entity);
                            }

                            return new CraftGuardianWrapper(server, (EntityGuardian) entity);
                        }

                        if (entity instanceof EntityVex) {
                            return new CraftVexWrapper(server, (EntityVex) entity);
                        }

                        if (entity instanceof EntityIllagerAbstract) {
                            if (entity instanceof EntityIllagerWizard) {
                                if (entity instanceof EntityEvoker) {
                                    return new CraftEvokerWrapper(server, (EntityEvoker) entity);
                                }

                                if (entity instanceof EntityIllagerIllusioner) {
                                    return new CraftIllusionerWrapper(server, (EntityIllagerIllusioner) entity);
                                }
                            }

                            if (entity instanceof EntityVindicator) {
                                return new CraftVindicatorWrapper(server, (EntityVindicator) entity);
                            }

                            return new CraftIllagerWrapper(server, (EntityIllagerAbstract) entity);
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

                    if (entity instanceof EntityShulker) {
                        return new CraftShulkerWrapper(server, (EntityShulker) entity);
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

    private static class CraftCodWrapper extends CraftCod {

        CraftCodWrapper(CraftServer craftServer, EntityCod entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftPufferFishWrapper extends CraftPufferFish {

        CraftPufferFishWrapper(CraftServer craftServer, EntityPufferFish entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSalmonWrapper extends CraftSalmon {

        CraftSalmonWrapper(CraftServer craftServer, EntitySalmon entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftTropicalFishWrapper extends CraftTropicalFish {

        CraftTropicalFishWrapper(CraftServer craftServer, EntityTropicalFish entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftDolphinWrapper extends CraftDolphin {

        CraftDolphinWrapper(CraftServer craftServer, EntityDolphin entity){
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

    private static class CraftPhantomWrapper extends CraftPhantom {

        CraftPhantomWrapper(CraftServer craftServer, EntityPhantom entity){
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

    private static class CraftParrotWrapper extends CraftParrot {

        CraftParrotWrapper(CraftServer craftServer, EntityParrot entity){
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

    private static class CraftPolarBearWrapper extends CraftPolarBear {

        CraftPolarBearWrapper(CraftServer craftServer, EntityPolarBear entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftTurtleWrapper extends CraftTurtle {

        CraftTurtleWrapper(CraftServer craftServer, EntityTurtle entity){
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

    private static class CraftDonkeyWrapper extends CraftDonkey {

        CraftDonkeyWrapper(CraftServer craftServer, EntityHorseDonkey entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftMuleWrapper extends CraftMule {

        CraftMuleWrapper(CraftServer craftServer, EntityHorseMule entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftLlamaWrapper extends CraftLlama {

        CraftLlamaWrapper(CraftServer craftServer, EntityLlama entity){
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

    private static class CraftSkeletonHorseWrapper extends CraftSkeletonHorse {

        CraftSkeletonHorseWrapper(CraftServer craftServer, EntityHorseSkeleton entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftZombieHorseWrapper extends CraftZombieHorse {

        CraftZombieHorseWrapper(CraftServer craftServer, EntityHorseZombie entity){
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

    private static class CraftHuskWrapper extends CraftHusk {

        CraftHuskWrapper(CraftServer craftServer, EntityZombieHusk entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftVillagerZombieWrapper extends CraftVillagerZombie {

        CraftVillagerZombieWrapper(CraftServer craftServer, EntityZombieVillager entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftDrownedWrapper extends CraftDrowned {

        CraftDrownedWrapper(CraftServer craftServer, EntityDrowned entity){
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

    private static class CraftStrayWrapper extends CraftStray {

        CraftStrayWrapper(CraftServer craftServer, EntitySkeletonStray entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftWitherSkeletonWrapper extends CraftWitherSkeleton {

        CraftWitherSkeletonWrapper(CraftServer craftServer, EntitySkeletonWither entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftSkeletonWrapper extends CraftSkeleton {

        CraftSkeletonWrapper(CraftServer craftServer, EntitySkeletonAbstract entity){
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

    private static class CraftElderGuardianWrapper extends CraftElderGuardian {

        CraftElderGuardianWrapper(CraftServer craftServer, EntityGuardianElder entity){
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

    private static class CraftVexWrapper extends CraftVex {

        CraftVexWrapper(CraftServer craftServer, EntityVex entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftEvokerWrapper extends CraftEvoker {

        CraftEvokerWrapper(CraftServer craftServer, EntityEvoker entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftIllusionerWrapper extends CraftIllusioner {

        CraftIllusionerWrapper(CraftServer craftServer, EntityIllagerIllusioner entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftVindicatorWrapper extends CraftVindicator {

        CraftVindicatorWrapper(CraftServer craftServer, EntityVindicator entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

    private static class CraftIllagerWrapper extends CraftIllager {

        CraftIllagerWrapper(CraftServer craftServer, EntityIllagerAbstract entity){
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

    private static class CraftShulkerWrapper extends CraftShulker {

        CraftShulkerWrapper(CraftServer craftServer, EntityShulker entity){
            super(craftServer, entity);
        }

        @Override
        public void setHealth(double health) {
            if(EntityWrapper.setHealth(this, health))
                super.setHealth(health);
        }

    }

}
