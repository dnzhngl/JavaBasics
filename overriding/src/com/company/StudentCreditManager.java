package com.company;

public class StudentCreditManager extends BaseCreditManager{
    // overrides the Base class method
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
