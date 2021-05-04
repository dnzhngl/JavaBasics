package com.company;

public class Main {

    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate(100);

        GameCalculator gameCalculator = new KidGameCalculator();
        gameCalculator.calculate(90);

        /* Abstract classes don't newable. To make it newable you have to override its abstract methods. But this is not a good practise.

        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void calculate(int score) {

            }
        };*/
    }
}
