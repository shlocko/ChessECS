package com.company;

import java.util.HashMap;
import java.util.Map;

public class Entity {
    private Map<String, Component> components = new HashMap<>();

    public Entity(int x, int y){
        addComponent(new Piece("pawn", "wP", x, y));

    }

    public void addComponent(Component component){
        components.put(component.getComponentName(), component);
    }
    public Map<String, Component> getComponents(){
        return components;
    }

}
