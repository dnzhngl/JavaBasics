package com.company;

public class CustomerManager {
    private ICustomerDal customerDal;
    // Constructor - must give an ICustomerDal type to initialize class.
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
    }
}
