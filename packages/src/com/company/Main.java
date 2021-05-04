package com.company;

// Java has built-in packages
import java.util.Scanner;

/*
import com.company.mathematics.FourOperations;
import com.company.mathematics.Logarithms; */
import com.company.mathematics.*; // Imports all of the classes in the mathematics package.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Our package usage
        FourOperations fourOperations = new FourOperations();
        fourOperations.sum(2,3);
        Logarithms logarithms = new Logarithms();
        logarithms.logarithmCalculate();
    }
}
