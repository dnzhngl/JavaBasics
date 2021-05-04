package com.company;

// Our employees
public class CompanyEmployee implements IWorkable, IDining, IPayable {
    @Override
    public void work() {
        System.out.println("Work between 9am - 5pm");
    }

    @Override
    public void workOvertime() {
        System.out.println("Get bonus!");
    }

    @Override
    public void eat() {
        System.out.println("Eat in the company's cafeteria.");
    }

    @Override
    public void pay() {
        System.out.println("Pay salary.");
    }
}
