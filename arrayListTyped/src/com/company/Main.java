package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("İzmir");
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Aydın");

        // remove() -> either can give an index number or the items self.
        /*cities.remove(2);
        cities.remove("Ankara");*/

        //sort()
        // cities.sort();
        Collections.sort(cities);

        for(String city : cities){
            System.out.println(city);
        }

    }
}
