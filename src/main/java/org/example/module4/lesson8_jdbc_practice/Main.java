package org.example.module4.lesson8_jdbc_practice;

import org.example.module4.lesson7_jdbc.DBConnection;
import org.example.module4.lesson7_jdbc.ResultSetConverter;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBConnection.getConnection();
        Savepoint savepoint = null;
        try {
            if (connection != null) {
                ResultSetConverter resultSetConverter = new ResultSetConverter();
                connection.setAutoCommit(false);

                savepoint = connection.setSavepoint("p1");

                PreparedStatement createUserPreparedStatement = connection.prepareStatement("INSERT INTO user(firstName, lastName, email) values ('idea','idea','value@gmail.com')");
                createUserPreparedStatement.executeQuery();


                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user where firstName = ?");
                preparedStatement.setString(1, "idea");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    System.out.println(resultSetConverter.toUser(resultSet));
                }
                connection.commit();
            }
        } catch (SQLException e) {
            connection.rollback(savepoint);
        }
    }
}
