package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String message = "The weather is rainy...";
	    String newMessage = message.substring(0,5); // substring() --> returns a text in a string type.
	    System.out.println(newMessage);

	    var result = sum(3,5);
	    System.out.println(result);

	    sum2(); // it is okay to not send any parameter to variable arguments.
	    int sumResult = sum2(2,3,4,5,6);
	    System.out.println(sumResult);
    }
    // void methods
    public static  void add(){
        System.out.println("Added.");
    }
    public static void delete(){
        System.out.println("Deleted.");
    }
    public static void update(){
        System.out.println("Updated.");
    }

    // returns int
    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    // variable arguments (...)
    public static int sum2(int... numbers){
        /*
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return  sum;*/
        return Arrays.stream(numbers).sum();
    }
}
