package com.company;

import java.util.HashMap;
import java.util.Map;

public class Entity {
    private Map<String, Component> components = new HashMap<>();

    public void addComponent(Component component){
        components.put(component.getComponentName(), component);
    }
    public Map<String, Component> getComponents(){
        return components;
    }
}
