package com.company;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Customer has been added on to MySql Database.");
    }
}
