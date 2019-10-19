package com.zipcodewilmington.scientificcalculator;

public class Scientific{

    public Scientific(){}

    double number;


    public double findSquare(double number){
        return number * number;
    }
    //lets find square root
    public Double findSquareRoot(double number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else System.out.println(".");
            return null;
    }
    //lets find inverse
    public Double findInverse(double number){
        if (number!=0){
            return 1/number;
        }
        else return null;
    }
}

