package com.company;

import java.util.List;

public class Moveable extends Component{
    private boolean hasMoved;
    private List<int[]> moves;

    public Moveable(List<int[]> moveList){
        String componentName = "moveable";
        this.hasMoved = false;
        this.moves = moveList;
    }

    public List<int[]> getMoves(){
        return moves;
    }
    public boolean getHasMoved(){
        return hasMoved;
    }
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
}
