package com.bootcoding.educationsystem.dao;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord
{
    public static void main(String[] args)
    {
        Connection con=DBconnectivity.getConnection();
        Statement smt=null;


        try
        {
           String query="insert into course (id,name) values(1,'Anshul')";
           smt = con.createStatement();
           smt.executeUpdate(query);
           System.out.println("Data inserted successfully..");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
