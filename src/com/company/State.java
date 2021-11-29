package com.company;

import java.util.ArrayList;
import java.util.List;

public class State {

    private List<Entity> entities = new ArrayList<>();


    public void addEntity(Entity entity){
        entities.add(entity);
    }

    public List<Entity> getEntities(){
        return entities;
    }
}
