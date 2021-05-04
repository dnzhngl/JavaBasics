package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // array
        int[] numbers = new int[]{1,2,3,4};
        // numbers[4] = 5; // Error
        numbers = new int[4]; // It will create a new array
        // System.out.println(numbers[0]);

        // ArrayList - can store all types of data at the same time. there is no type safety
        ArrayList numbers2 = new ArrayList();

        numbers2.add(1);
        numbers2.add(10);
        numbers2.add("Ankara");

        // returns the number of items in the list
        /* int size = numbers2.size();
        System.out.println(size);*/

        // get() --> returns the item in the given index.
        /* var item = numbers2.get(0);
        System.out.println(item);*/

        // sets the item on the given index with the given parameter.
        /* numbers2.set(2, 25);
        System.out.println(numbers2.get(2));*/

        // remove() --> removes the item on the given index. And the size of the arrayList shrinks.
        /* numbers2.remove(0);
        System.out.println(numbers2.get(0));*/

        // clear() --> removes all of the items on the list.
        /* numbers2.clear();
        System.out.println(numbers2.get(0));*/

        for(Object item : numbers2){
            System.out.println(item);
        }
    }
}
