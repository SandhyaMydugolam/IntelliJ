package com.inter.extend;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator Calculator = new BasicCalculator();
        Calculator.add(7,6);
        Calculator.product(5,4);

        IScientific Scientific = new ScientificCalc();
        Scientific.cube(3);
        Scientific.square(9);


    }
}
