package com.company;

public class Piece extends Component{
    private final String type;
    private final String printName;
    public Coordinate coordinate;


    public Piece(String type, String printName, int x, int y){
        this.componentName = "Piece";
        this.type = type;
        this.printName = printName;
        coordinate = new Coordinate(x, y);
    }
    public String getPrintName(){
        return printName;
    }
    public String getType(){
        return type;
    }
}
