package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList<String> cities = new MyList<>();
        cities.add("Ankara");
        // cities.add(1); --> gives error: can not add an integer type in a string list.

        MyList<Customer> customers = new MyList<>();
        customers.add(new Customer());
    }
}
