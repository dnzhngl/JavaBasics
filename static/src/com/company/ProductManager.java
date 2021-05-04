package com.company;

public class ProductManager {

    public void add(Product product){
       // ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)){
            System.out.println("Product has been added.");
        } else {
            System.out.println("The product is not valid!");
        }

        ProductValidator validator = new ProductValidator();
        validator.Something();
    }


}
