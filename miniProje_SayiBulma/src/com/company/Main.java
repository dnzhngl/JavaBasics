package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = new int[]{1,2,5,7,9};
	    int search = 7;

	    boolean isThere = false;
	    for(int number : numbers){
	        if(number == search){
	            isThere = true;
	            break;
            }
        }

	    if(isThere){
	        System.out.println("Found it!");
        }else{
	        System.out.println("Not found it...");
        }
    }
}
