package com.company;

public class Piece extends Component{
    private String type;
    private String printName;


    public Piece(String type, String printName){
        String componentName = "piece";
        this.type = type;
        this.printName = printName;
    }
    public String getPrintName(){
        return printName;
    }
    public String getType(){
        return type;
    }
}
