package com.bootcoding.educationsystem.dao;
import java.sql.Connection;
import java.sql.Statement;

public class InsertStudentRecord
{
    public static void main(String[] args)
    {
        Connection con= DbConnection.getConnection();
        try
        {
           String query="insert into student (id,name,email, phone) values(2,'Akash','anshul@gmail.com','88776655')";
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
