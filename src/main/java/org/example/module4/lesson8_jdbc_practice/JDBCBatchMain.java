package org.example.module4.lesson8_jdbc_practice;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import org.example.module4.lesson7_jdbc.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBatchMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql =  "insert into user(firstName, last_Name, email, age) values(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        connection.setAutoCommit(false);

        for (int i = 0; i < 100; i++) {
            preparedStatement.setString(1, "firstName" + i);
            preparedStatement.setString(2, "lastName" + i);
            preparedStatement.setString(3, "email" + i);
            preparedStatement.setInt(4, i);
            preparedStatement.addBatch();
            if (i % 20 == 0) {
                preparedStatement.executeBatch();
            }
        }

        preparedStatement.executeBatch();
        connection.commit();
        System.out.println("Done");


    }
}
