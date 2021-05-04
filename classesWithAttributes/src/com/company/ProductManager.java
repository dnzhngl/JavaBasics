package com.company;

public class ProductManager {

    public void add(Product product){
        System.out.println(product.getName() +  ", product has been added.");
    }
    public void remove(Product product){
        System.out.println(product.getName() +  ", product has been removed.");
    }
    public void update(Product product){
        System.out.println(product.getName() +  ", product has been updated.");
    }

    // public void add(int id, String name, double price, int stockAmount, String description){ } --> not a best practice
}
