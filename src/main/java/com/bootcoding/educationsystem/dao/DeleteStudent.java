package com.bootcoding.educationsystem.dao;
import java.sql.Connection;
import java.sql.Statement;

public class DeleteStudent
{
    public static void main(String[] args)
    {
        Connection con= DbConnection.getConnection();
        try
        {
           String query="DELETE FROM student " +
            "WHERE id = 7";
           Statement smt = con.createStatement();
           smt.executeUpdate(query);
           System.out.println("Data inserted successfully..");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
