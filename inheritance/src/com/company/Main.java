package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.id = 1;
        customer.firstName = "Ali";
        customer.lastName = "Gülümser";
        customer.age = 30;
        customer.email = "ali.gulumser@gmail.com";

        employee.id = 1;
        employee.firstName = "Sevim";
        employee.lastName = "Sevmez";
        employee.age = 28;
        employee.salary = 5300;

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.BestEmployee(employee);
        employeeManager.add(employee);
        employeeManager.list();

        customerManager.add(customer);
        customerManager.list();
    }
}
