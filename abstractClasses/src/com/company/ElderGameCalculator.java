package com.company;

public class ElderGameCalculator extends GameCalculator{
    @Override
    public void calculate(int score) {
        System.out.println("Elder score : " + score);
    }
}
