package com.ome_r.wildstacker.mobspatch.reflection;

import java.lang.reflect.Field;

public enum Fields {

    ENTITY_BUKKIT_ENTITY;

    public void set(Object object, Object value){
        try {
            getField().set(object, value);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private Field getField(){
        return ReflectionUtil.fieldMap.get(this);
    }

}
