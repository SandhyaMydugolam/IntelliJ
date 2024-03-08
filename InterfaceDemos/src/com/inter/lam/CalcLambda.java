package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator calculator = (x,y)-> {
            return x+y;
        };
        System.out.println(calculator.Calculate(3,5));
        IMyCalculator calculator1 = (x,y)->{
            return x-y;
        };
        System.out.println(calculator1.Calculate(5,2));
        IMyCalculator calculator2 = (x,y)->{
            return x*y;
        };
        System.out.println(calculator2.Calculate(5,5));
    }
}
