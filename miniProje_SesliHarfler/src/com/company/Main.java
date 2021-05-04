package com.company;

public class Main {

    public static void main(String[] args) {
	    char letter = 'A';

	    switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harftir.");
                break;
            default:
                System.out.println("Lütfen sesli harf giriniz.");
        }
    }
}
