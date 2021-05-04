package com.company;

public class MssqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data has been fetched from Mssql Database.");
    }
}
