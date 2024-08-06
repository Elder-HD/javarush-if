package org.example.module4.lesson7_jdbc;

import java.sql.*;

public class JdbcApplication {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javarush",
                "root", "SFCxElder_589"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from cities limit 10");

        ResultSetMetaData metaData = resultSet.getMetaData();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            System.out.printf("%s(%s) ",metaData.getColumnName(i),metaData.getColumnTypeName(i));
        }
        System.out.println();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int population = resultSet.getInt("population");
            String city = resultSet.getString("city");
            String country = resultSet.getString("country");
            System.out.printf("%-5d %-9d %-20s %-20s\n",id,population,city,country);

        }
    }

}
