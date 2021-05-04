package com.company;

public class Main {

    public static void main(String[] args) {
        // Interfaces can be used as a reference to classes.
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();

        // Polymorphism - applied with interface
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
