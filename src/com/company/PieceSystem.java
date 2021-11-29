package com.company;

public class PieceSystem {

    public static Piece findPieceByCoord(int x, int y){
        Piece piece = null;
        for (Entity entity : Engine.programState.getEntities()) {
            if(entity.getComponents().containsKey("Piece")){
                Piece p = ((Piece) entity.getComponents().get("Piece"));
                if(p.coordinate.x == x && p.coordinate.y == y){
                    piece = p;
                }
            }
        }

        return piece;
    }
}
