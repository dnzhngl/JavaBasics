package com.company;

public class EmailLogger extends BaseLogger{
    // overriding
    public void log(String message){
        System.out.println("Logged to email : " +message);
    }
}
