package com.ome_r.wildstacker.mobspatch.reflection;

import org.bukkit.Bukkit;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class ReflectionUtil {

    private static String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];

    static Map<Fields, Field> fieldMap = new HashMap<>();

    public static void init(){
        try{
            Class entityClass = getNMSClass("Entity");
            fieldMap.put(Fields.ENTITY_BUKKIT_ENTITY, entityClass.getDeclaredField("bukkitEntity"));
            fieldMap.values().forEach(field -> field.setAccessible(true));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private static Class getNMSClass(String className){
        try{
            return Class.forName("net.minecraft.server." + version + "." + className);
        }catch(ClassNotFoundException ex){
            throw new NullPointerException(ex.getMessage());
        }
    }

}
