package com.bootcoding.educationsystem.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadStudentRecord
{
    public static void main(String[] args)
    {
        Connection con= DbConnection.getConnection();
        Statement smt=null;
        ResultSet rs=null;

        try
        {
            String query="select * from student";
            smt = con.createStatement();
            rs=smt.executeQuery(query);

            while (rs.next()){
                System.out.println("id : "+rs.getInt("id"));
                System.out.println("name : "+rs.getString("name"));
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
