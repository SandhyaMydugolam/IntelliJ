package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape shape = new IShape() {

            @Override
            public void area(int x, int y) {
                int area = x * y;
                System.out.println("Area of rectangle :"+area);

            }

        };
        IShape shape1 = new IShape() {
            @Override
            public void area(int x, int y) {
                float area = x*y/2;
                System.out.println("Area of triangle :"+area);
            }
        };
        shape.area(7,6);
        shape.area(3,1);

    }
}

