package org.example.module4.lesson7_jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final Logger LOGGER = LoggerFactory.getLogger(DBConnection.class);
    private static final String URL = "jdbc:mysql://localhost:3306/javarush";
    private static final String USER = "root";
    private static final String PASSWORD = "SFCxElder_589";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            LOGGER.error("Error during sql connection");
        }
        return connection;
    }
}
