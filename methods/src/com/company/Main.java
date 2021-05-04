package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9};
        int search = 6;
        int search2 = 5;

        findTheNumber(numbers, search);
        findTheNumber(numbers, search2);
    }
    public static void findTheNumber(int[] numbers, int numberToSearch ){

        boolean isThere = false;
        for(int number : numbers){
            if(number == numberToSearch){
                isThere = true;
                break;
            }
        }
        showResult(isThere, numberToSearch);
    }
    public static  void showResult(boolean found, int number) {
        if(found){
            System.out.println(number + "... Found it!");
        }else{
            System.out.println(number + "... Not found it...");
        }
    }
}
