package com.bootcoding.educationsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbConnection
{
    public static Connection getConnection()
    {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String userid="postgres";
        String password="admin";

        Connection con = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,userid,password);

            if (con!=null)
            {
                System.out.println("Connection successfully..");
            }
            else
            {
                System.out.println("Connection Failed..");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        return con;
    }


    public boolean exists(Connection con, String tableName, long id) {
        try {
            Statement stmt = con.createStatement();
            String sql = "Select * from " + tableName + " where id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
