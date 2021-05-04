package com.company;

public class FileLogger extends BaseLogger{
    // overriding
    public void log(String message){
        System.out.println("Logged to file : " +message);
    }
}
