package com.company;

public class KidGameCalculator extends GameCalculator{
    @Override
    public void calculate(int score) {
        System.out.println("Kid score:" + score);
    }
}
