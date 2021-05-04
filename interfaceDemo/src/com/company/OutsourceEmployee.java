package com.company;

public class OutsourceEmployee implements IWorkable{
    @Override
    public void work() {
        System.out.println("Works between 1pm - 5pm");
    }

    @Override
    public void workOvertime() {
        System.out.println("Get tickets.");
    }
}
