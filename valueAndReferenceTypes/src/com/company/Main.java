package com.company;

public class Main {

    public static void main(String[] args) {
	    // Reference Types : string, classes, interfaces, arrays.. Stored on Heap
        // Value Types : int, boolean, float, double.. Stored on Stack

        // Value Types - stored on Stack
        int number1 = 10;
        int number2 = 20;

        number2 = number1; // number2 = 10;
        number1 = 30;   // number1 = 30;
        System.out.println(number2); // 10

        // Reference Types - stored on Heap - has reference address
        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1; // numbers2 = numbers1 reference address
        numbers1[0] = 10; // numbers1 = {10,2,3,}

        System.out.println(numbers2[0]);  // numbers2[0] = numbers1[0] = 10;
    }
}
