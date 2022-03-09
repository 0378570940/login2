package com.example.demo_user.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
    public static boolean saveDb(String sql) {
        boolean result = false;
        Connection connection = null;
        try {
//            connection = DriverManager.getConnection(URL, USER_NAME, PASS_WORRD);
            Statement statement = connection.createStatement();// có tham số
            statement.execute(sql);
            result = true;
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            // bước 6 đóng connecttion
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
