package com.company;

public class Product {

    // constructor without parameter
    public Product(){
        System.out.println("This is Constructor");
    }
    // constructor with parameter
    // constructor overloading
    public Product(int id, String name, double price, int stockAmount, String description, String color){
        System.out.println("This is Constructor with parameter");
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
        this.description = description;
        this.color = color;
    }

    // attribute | field
    // default access modifier is public
    private int id;
    private String name;
    private double price;
    private int stockAmount;
    private String description;
    private String color;
    private String code;


    // getters + setters
    // getter
    public int getId(){
        return id;
    }
    // setter
    public void setId(int id){
        this.id = id; // this --> the class itself
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // readonly
    public String getCode() {
        return this.name.substring(0,1) + id;
    }

}
