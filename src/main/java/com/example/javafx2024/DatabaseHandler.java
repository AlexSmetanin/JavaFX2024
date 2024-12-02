package com.example.javafx2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionUrl = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionUrl, dbUser, dbPass);

        return dbConnection;
    }

    public void singUpUser(String firstName, String lastName, String userName, String password,
                           String location, String gender) throws ClassNotFoundException, SQLException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + "," + Const.USER_LASTNAME + "," +
                Const.USER_USERNAME + "," + Const.USER_PASSWORD + "," +
                Const.USER_LOCATION + "," + Const.USER_GENDER + ")" +
                "VALUES(?,?,?,?,?,?)";

        PreparedStatement ps = getDbConnection().prepareStatement(insert);
        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setString(3, userName);
        ps.setString(4, password);
        ps.setString(5, location);
        ps.setString(6, gender);
        ps.executeUpdate();

    }
}
