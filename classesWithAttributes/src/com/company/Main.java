package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
       /*
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(3.500);
        product.setStockAmount(5);
        product.setDescription("Asus, intel i5");*/

        ProductManager productManager = new ProductManager();
        // productManager.add(product);
        // System.out.println(product.getCode());

        Product product2 = new Product(2,"Mobile phone", 1500,12,"Iphone","White");
        productManager.add(product2);
        System.out.println(product2.getCode());



       // productManager.add(2, "Mobile phone", 2.100, 9, "Iphone SE"); --> wrong way
    }
}
