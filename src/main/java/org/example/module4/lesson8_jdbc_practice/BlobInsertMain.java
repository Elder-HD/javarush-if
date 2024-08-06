package org.example.module4.lesson8_jdbc_practice;

import org.example.module4.lesson7_jdbc.DBConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobInsertMain {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Connection connection = DBConnection.getConnection();
        String sql = """
            insert into products(image, name, price) values (?,?,?)
            """;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        preparedStatement.setBinaryStream(1, fileInputStream, new File("file.txt").length());
        preparedStatement.setString(2, "image");
        preparedStatement.setDouble(3, 1.0);
        preparedStatement.executeUpdate();
        System.out.println("Done!");
    }

}
