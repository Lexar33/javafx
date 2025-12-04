package com.jaar;

public class ShapeFactory  {
    public static Rectangle getRecShape(){
        return new Rectangle();
    }
    public static Circle getCircleShare(){
        return new Circle();
    }

    public static Square getSquareShare(){
        return new Square();
    }
}
