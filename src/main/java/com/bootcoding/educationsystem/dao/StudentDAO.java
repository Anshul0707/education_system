package com.bootcoding.educationsystem.dao;

import com.bootcoding.educationsystem.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO
{
    public static final String TABLE_NAME = "student";
    private DbConnection dbConnection;

    public void insertStudent(Student student)
    {
        Connection con = null;
        try
        {
                con=DbConnection.getConnection();

                String sql = "INSERT INTO " + TABLE_NAME +" VALUES ( ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1,student.getId());
                ps.setString(2,student.getName());
                ps.setString(3,student.getEmail());
                ps.setLong(4,student.getPhone());
                ps.executeUpdate();
                System.out.println("Student record inserted..");

        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
