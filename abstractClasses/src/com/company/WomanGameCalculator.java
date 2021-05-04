package com.company;

public class WomanGameCalculator extends GameCalculator{
    @Override //--> annotation, indicated that the method below is an override method
    public void calculate(int score) {
        System.out.println("Woman score:" + score);
    }
}
