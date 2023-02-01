package com.bootcoding.educationsystem.dao;
import java.sql.Connection;
import java.sql.Statement;

public class DeleteStudent
{
    public static void main(String[] args)
    {
        int [] id={16,17};
        deletRecord(id);
    }
    public static void deletRecord(int [] id)
    {
        Connection con= DbConnection.getConnection();

        String s = "";
        for (int i = 0; i < id.length; i++)
        {
            s  = s + id[i];
            if(i < id.length-1)
            {
                s = s + ",";
            }
        }

        try
        {
            String query="DELETE FROM student WHERE id IN ("+ s +")";
            Statement smt = con.createStatement();
            smt.executeUpdate(query);
            System.out.println("Data deleted successfully..");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
