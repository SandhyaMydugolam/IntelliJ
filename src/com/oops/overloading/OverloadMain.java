package com.oops.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calcArea(  10);
        shape.calcArea( 2.0);
        int rect = shape.calcArea( 10,20);
        System.out.println("Rect "+rect);
        double tri = shape.calcArea((int) 7.7,7);
        System.out.println(tri);
        double tri1 =shape.calcArea(12.0,7);
        System.out.println(tri1);




    }
}
