package com.company;

// Base Class
// abstract class --> do not have to have abstract operation
public  abstract class GameCalculator {
    // abstract method --> all of the classes that derived from this class have to override this method.
    public abstract void calculate(int score);

    // not overridable
    public final void gameOver(){
        System.out.println("Game over!");
    }
}
