package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String message = "    The weather is beautiful today!      ";
        System.out.println(message);

    /*  // .length() --> Returns the length of the text.
        System.out.println(message.length());
        // charAt() --> Returns the character in the given index.
        System.out.println("5th character : " + message.charAt(4));
        // concat() --> Attach the given text to the string.
        System.out.println(message.concat(" Horraay!!"));

        // startsWith() --> if the string starts with the given char returns true, else returns false
        System.out.println(message.startsWith("T"));
        System.out.println(message.startsWith("t"));

        // endsWith() --> if the string ends with the given char returns true, else returns false
        System.out.println(message.endsWith("!"));
        System.out.println(message.endsWith("A"));

        // getChars() --> get chars from 0 to 5th index (not included), copy them to the characters array, start to place them from 1st index.
        char[] characters = new char[6];
        message.getChars(0,5, characters, 1);
        System.out.println(characters);
        characters[0] = '*';
        System.out.println(characters[0]);

        // indexOf() --> Gives the index of the asked string that founds first, if not found returns -1.
        System.out.println(message.indexOf("i"));
        System.out.println(message.indexOf("ay!"));
        // lastIndexOf() --> Starts to search from the end of the text.
        System.out.println(message.lastIndexOf("i"));

        // replace() -->cReplaces asked chars in the string with the given char.
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.replace('b', 'B'));

        // substring(5) --> Takes from the given index to the end of the text.
        System.out.println(message.substring(5));
        // substring(2,4) --> Takes from the 4th index to the 7th index. (7th is not included)
        System.out.println(message.substring(4,7));

        // split() --> splits the word based on the given string.
        for (String word: message.split(" ")) {
            System.out.println(word);
        }

        // toLowerCase
        System.out.println(message.toLowerCase());
        // toUpperCase
        System.out.println(message.toUpperCase());

        // trim() --> trims the string to get rid of the spaces from the start and end of the text.
        System.out.println(message.trim());
        */
    }
}
