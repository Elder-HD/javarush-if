package org.example.module4.lesson7_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetConverter {
    public User toUser(ResultSet resultSet) {
        try {
            return new User(
                    resultSet.getLong("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getInt("age"),
                    resultSet.getString("phone_number"),
                    resultSet.getString("city")
            );
        } catch (SQLException e) {
            throw new ResultSetConverterException("ResultSet to User convert error: " + e.getMessage());
        }
    }
}
