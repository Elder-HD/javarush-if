package org.example.module4.lesson8_jdbc_practice;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JdbcRowSetMain {
    public static void main(String[] args) throws SQLException {
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/javarush");
        jdbcRowSet.setUsername("root");
        jdbcRowSet.setPassword("root");
        jdbcRowSet.setCommand("select * from student");
        jdbcRowSet.execute();

        while (jdbcRowSet.next())
            System.out.println(jdbcRowSet.getString("firstName"));

        jdbcRowSet.absolute(1);
        jdbcRowSet.updateString("firstName", "New value");
        jdbcRowSet.updateRow();
    }
}
