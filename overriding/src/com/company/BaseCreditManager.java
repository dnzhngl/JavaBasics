package com.company;

import java.sql.Struct;

public class BaseCreditManager {
    // overridable
    public double calculate(double amount) {
        return amount * 1.18;
    }

    // final --> can not overridable
    public final boolean creditGiveable(boolean isReliable){
        if (isReliable){
            return true;
        }
        return false;
    }
}

