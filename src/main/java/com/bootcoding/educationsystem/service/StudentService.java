package com.bootcoding.educationsystem.service;

import com.bootcoding.educationsystem.dao.StudentDAO;
import com.bootcoding.educationsystem.model.Student;
import com.bootcoding.educationsystem.utils.EmailIdGenerator;
import com.bootcoding.educationsystem.utils.NameGenerator;
import com.bootcoding.educationsystem.utils.PhoneNumberGenerator;

public class StudentService
{
    private StudentDAO studentDAO;

    public StudentService()
    {
        studentDAO=new StudentDAO();
    }

    public void createRandomStudents()
    {
        for (int i = 1; i <= 50; i++)
        {
            Student student = new Student();
            student.setId(i);
            student.setName(NameGenerator.getName());
            student.setEmail(EmailIdGenerator.getEmailId(student.getName()));
            student.setPhone(PhoneNumberGenerator.getPhoneNumber());

            studentDAO.insertStudent(student);
        }
    }
    public void getStudent()
    {
        Student student = new Student();
        System.out.println("Fetched Record...");
        studentDAO.ReadStudent(student);

    }
}
