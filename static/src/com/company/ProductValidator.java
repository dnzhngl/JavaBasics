package com.company;

// Main class - it can not be marked as static.
public class ProductValidator {

    // static constructor runs when a static method in this class used.
    // there can be any number of static constructor. When the static method called, all of the static constructor runs.
    static{
        System.out.println("Static constructor runs.");
    }

    // This constructor runs when the class is newed.
    public ProductValidator(){
        System.out.println("Constructor runs.");
    }

    // static makes the class initialize just once and use for everything.
    // static mostly used for Utilities.
    // when a class or a method marked as static, it does not removed from the memory.
    // when a method marked as static, it is reached through its classname.
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // Since the method is not static, the class must be instantiate to call this method.
    public void Something(){
        System.out.println("Something done.");
    }

    // Innerclass - use for grouping the operations.
    // It can be marked as static.
    public static class Innerclass{
        public static void Delete(){

        }
    }
}
