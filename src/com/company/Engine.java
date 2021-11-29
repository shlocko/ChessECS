package com.company;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    public static Map<Character, Integer> toCoord = Map.of(
            'a', 1,
            'b', 2,
            'c', 3,
            'd', 4,
            'e', 5,
            'f', 6,
            'g', 7,
            'h', 8
    );
    public static State programState = new State();

    public Engine(){

        programState.addEntity(new Entity(1, 1));
        programState.addEntity(new Entity(2, 2));
    }

    public static void handleMessage(String message){
        String[] commands = message.split(" ", 2);
        int initialX = toCoord.get(commands[0].charAt(0));
        int initialY = commands[0].charAt(1) - 48;

        int newX = toCoord.get(commands[1].charAt(0));
        int newY = commands[1].charAt(1) - 48;

        Piece piece = PieceSystem.findPieceByCoord(initialX, initialY);
        if(piece != null){
            piece.coordinate = new Coordinate(newX, newY);
            System.out.println("New piece coordinates: X " + piece.coordinate.x + " Y " + piece.coordinate.y);
        } else {
            System.out.println("No piece found");
        }

    }
}
