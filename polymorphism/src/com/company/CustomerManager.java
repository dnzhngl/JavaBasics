package com.company;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){  // Have to give the loggerType when created an instance of the class.
        this.logger = logger;
    }

    public void add(){
        System.out.println("Customer has been added.");
        this.logger.log("Adding operation has been logged.");
    }
}
