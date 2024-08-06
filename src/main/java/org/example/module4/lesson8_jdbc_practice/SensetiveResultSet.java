package org.example.module4.lesson8_jdbc_practice;

import org.example.module4.lesson7_jdbc.DBConnection;
import org.example.module4.lesson7_jdbc.ResultSetConverter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SensetiveResultSet {
    public static void main(String[] args) throws SQLException {
        ResultSetConverter resultSetConverter = new ResultSetConverter();
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
        if (resultSet.last()) {
            resultSet.updateString("firstName", "Res set value");
            resultSet.updateRow();
        }

        if (resultSet.first()) {
            System.out.println(resultSetConverter.toUser(resultSet));
        }

    }
}
