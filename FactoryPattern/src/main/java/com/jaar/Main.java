package com.jaar;



public class Main {

    public static void main(String[] args) {
        //Rectangle rectangle = new Rectangle();
        Shape shape = ShapeFactory.getRecShape();
        shape.draw();



    }
}
