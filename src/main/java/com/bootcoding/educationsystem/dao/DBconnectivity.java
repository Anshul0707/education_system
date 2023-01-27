package com.bootcoding.educationsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnectivity
{
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

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
}
