package com.company;

public class OracleCustomerDal implements  ICustomerDal{
    @Override
    public void add() {
        System.out.println("Customer has been added on to Oracle Database.");
    }
}
