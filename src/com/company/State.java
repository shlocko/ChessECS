package com.company;

import java.util.ArrayList;
import java.util.List;

public class State {

    private List<Entity> entities = new ArrayList<>();

    public void handleMessage(String message){

    }
    public void addEntity(Entity entity){
        entities.add(entity);
    }
}
