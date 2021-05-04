package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeIntoFile();
        readFile();
    }

    public static void fileCreation() {
        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt");
        try {
            //file.createNewFile(); // creates the file. and returns true false, if the file already existed it does nothing.
            if(file.createNewFile()){
                System.out.println("The file has been created.");
            } else{
                System.out.println("The file has already existed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt");
        // file.exists(); --> if the file already exist returns true, else returns false;
        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("File path name: " + file.getAbsolutePath());
            System.out.println("Is file can writeable: " + file.canWrite());
            System.out.println("Is file can readable: " + file.canRead());
            System.out.println("File size (byte): " + file.length());
        }
    }

    public  static void readFile(){
        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
    }

    public static  void writeIntoFile(){
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt", true));
            // FileWriter writer = new FileWriter("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt");  // it writes over the file.
            // FileWriter writer = new FileWriter("C:\\Users\\Deniz\\IdeaProjects\\workingWithFiles\\files\\students.txt", true);  // it appends the file.

            writer.newLine(); // move to the new line
            writer.write("Selim"); // appends the text enf of the last text.
            System.out.println("The file has been written.");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
