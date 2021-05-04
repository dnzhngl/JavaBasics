package com.company;

// Main class
public class DatabaseHelper {

    // Inner class
    public static class Crud{     // Create- Read- Update- Delete operations
        public static void Delete(){}
        public static void Update(){}
    }

    // Another inner class
    public static  class Connection{
        public static void createConnection(){}
    }

}

// Instead of using inner class, for the sake of SOLID principles, a class should have just one job. As a result, this type of usage is not a best practice.