package org.example.module4.lesson7_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBConnection.getConnection();

        if (connection != null) {
            ResultSetConverter resultSetConverter = new ResultSetConverter();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            while (resultSet.next()) {
                System.out.println(resultSetConverter.toUser(resultSet));
            }
        }
    }
}
