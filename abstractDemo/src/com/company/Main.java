package com.company;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.databaseManager = new MssqlDatabaseManager();
        customerManager2.getCustomers();

        CustomerManager customerManager3 = new CustomerManager();
        customerManager3.databaseManager = new MySqlDatabaseManager();
        customerManager3.getCustomers();
    }
}
