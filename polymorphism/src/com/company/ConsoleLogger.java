package com.company;

public class ConsoleLogger extends BaseLogger{
    // overriding
    public void log(String message){
        System.out.println("Logged to console : " +message);
    }
}
