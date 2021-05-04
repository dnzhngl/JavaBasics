package com.company;

import java.io.BufferedReader; // Help to read files on memory.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // 1st way to handle exception
    // Java force you to write checked exception in to try catch blocks. If you don't do it, It makes the people who will use it must use it with try catch blocks.
    /*public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
    }*/
    public static void main(String[] args){
        // 2nd way to handle exception
        int sum = 0;
        BufferedReader reader = null;
        {
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\Deniz\\IdeaProjects\\exceptionHandling_ReadingFile\\src\\com\\company\\numbers.txt"));

                String line = null;
                while ((line = reader.readLine()) != null){
                    sum += Integer.valueOf(line);
                }
                System.out.println("Sum : " + sum);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close(); // throws IOException -> if the file is not found
                }catch (IOException exception){
                    System.out.println("The file could not found.");
                }
            }
        }
    }
}
