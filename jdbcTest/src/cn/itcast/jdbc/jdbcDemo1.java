package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo1 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/DB","root","root");
        String sql = "update people set Location = 'HeNan' where Age = 25";
        String sql1 = "insert into people values(33, 'SiChuan')";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        Boolean checkInsert = stmt.execute(sql1);
        System.out.println(count);
        System.out.println(checkInsert);
        stmt.close();
        stmt.close();
    }

}
