package org.example.module4.lesson8_jdbc_practice;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolExample {
    public static void main(String[] args) throws SQLException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/javarush");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");

        basicDataSource.setMinIdle(5);
        basicDataSource.setMaxIdle(10);

        Connection connection = basicDataSource.getConnection();

    }
}
