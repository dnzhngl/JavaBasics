package com.company;

public class Main {

    public static void main(String[] args) {

        // if error occurs, the application continue to run.
        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        } catch (StringIndexOutOfBoundsException exception){
            System.out.println("String index out of bounds exception : " + exception);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index out of bounds exception : " + exception);
        } catch (Exception exception){ // Exception is the base class other types of exceptions. When any of the stated exceptions can not catch the exception, this will catch.
            System.out.println("An error occurred : " + exception);
            System.out.println("Logged.");
        }
        finally {
            System.out.println("Finally runs under all conditions.");
        }
    }
}
