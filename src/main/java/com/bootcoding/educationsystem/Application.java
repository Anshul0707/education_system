package com.bootcoding.educationsystem;
import com.bootcoding.educationsystem.service.StudentService;

public class Application
{
    public static void main(String[] args)
    {
        StudentService studentService = new StudentService();
        studentService.createRandomStudents();
    }
}
