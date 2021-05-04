package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.2, 1.3, 4.3, 5.6};
        double sum = 0;
        double max = numbers[0];

        for (double number : numbers) {
            sum += number;
            System.out.println(number);

            if (number > max) {
                max = number;
            }
        }
        System.out.println("Sum :" + sum);
        System.out.println("Biggest Number :" + max);
    }
}
