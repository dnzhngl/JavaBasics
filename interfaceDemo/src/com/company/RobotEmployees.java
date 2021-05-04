package com.company;

public class RobotEmployees implements  IWorkable{
    @Override
    public void work() {
        System.out.println("Work hard!");
    }

    @Override
    public void workOvertime() {
        System.out.println("Work till your battery is running out.");
    }
}
