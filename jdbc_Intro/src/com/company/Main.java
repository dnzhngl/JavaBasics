package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    //JDBC --> it is a package, used for database connection.
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        // PreparedStatement -> Sql query for insert operations
        PreparedStatement statement = null;
        // ResultSet -> the result of the query
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection has been created.");

            String sql = "select * from City where Id = ?;";

            // for the update operations prepareStatement is in use.
            statement = connection.prepareStatement(sql);

            // parameters -> must be written after prepareStatement() and before executeUpdate()
            statement.setInt(1, 4081);


            // executeUpdate() -> return the number of rows affected from the query.
            int numberOfResult = statement.executeUpdate();
            System.out.println(numberOfResult + " row has been affected. Data has been deleted.");

        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            // statement and connection must be closed.
            statement.close();
            connection.close();
        }

    }

    // Select -- Connect to mySql database and executes a select query.
    public static void selectData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        // Statement -> Sql query
        Statement statement = null;
        // ResultSet -> the result of the query
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection has been created.");

            statement = connection.createStatement(); // Creates a query for the used connection and assigns it to statement.
            resultSet = statement.executeQuery("Select Code, Name, Continent, Region from country"); //statement executes the given query and assign the returned data to resultSet.

            ArrayList<Country> countries = new ArrayList<>();

            // resultSet.next() -> iterate through out the data
            while(resultSet.next()){
                countries.add( new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());

        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    // Insert into -- Connect to mySql database and executes an insert data query
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        // PreparedStatement -> Sql query for insert operations
        PreparedStatement statement = null;
        // ResultSet -> the result of the query
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection has been created.");

            String sql = "Insert into City (Name, CountryCode, District, Population) values (?, ?, ?, ?);";

            // for the insert operations prepareStatement is in use.
            statement = connection.prepareStatement(sql);

            // Parameters
            // setString(), setInt() etc. --> used for to send the parameters as a part of the query in the form of required data type and required order.
            statement.setString(1,"Duzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Duzce 2");
            statement.setInt(4,70000);

            // executeUpdate() -> return the number of rows affected from the query.
            int numberOfResult = statement.executeUpdate();
            System.out.println(numberOfResult + " row has been affected. Data has been added.");

        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            // statement and connection must be closed.
            statement.close();
            connection.close();
        }
    }

    // Update
    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        // PreparedStatement -> Sql query for update operations
        PreparedStatement statement = null;
        // ResultSet -> the result of the query
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection has been created.");

            String sql = "update City set Population = ?, CountryCode = ?, District = ? where Id = ?;";

            // for the update operations prepareStatement is in use.
            statement = connection.prepareStatement(sql);

            // parameters -> must be written after prepareStatement() and before executeUpdate()
            statement.setInt(1, 700002);
            statement.setString(2, "TUR");
            statement.setString(3, "Duzce 2");
            statement.setInt(4, 4082);

            // executeUpdate() -> return the number of rows affected from the query.
            int numberOfResult = statement.executeUpdate();
            System.out.println(numberOfResult + " row has been affected. Data has been updated.");

        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            // statement and connection must be closed.
            statement.close();
            connection.close();
        }
    }

    // Delete
    public static  void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        // PreparedStatement -> Sql query for delete operations
        PreparedStatement statement = null;
        // ResultSet -> the result of the query
        ResultSet resultSet;

        try{
            connection = dbHelper.getConnection();
            System.out.println("Connection has been created.");

            // Query in type of string to be used as a parameter for the prepareStatement();
            String sql = "delete from City where Id = ?;";

            // for the delete operations prepareStatement is in use.
            statement = connection.prepareStatement(sql);

            // parameters -> must be written after prepareStatement() and before executeUpdate()
            statement.setInt(1, 4082);

            // executeUpdate() -> return the number of rows affected from the query.
            int numberOfResult = statement.executeUpdate();
            System.out.println(numberOfResult + " row has been affected. Data has been deleted.");

        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            // statement and connection must be closed.
            statement.close();
            connection.close();
        }
    }
}
