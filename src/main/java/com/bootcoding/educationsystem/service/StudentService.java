package com.bootcoding.educationsystem.service;

import com.bootcoding.educationsystem.dao.StudentDAO;
import com.bootcoding.educationsystem.model.Student;
import com.bootcoding.educationsystem.utils.EmailIdGenerator;
import com.bootcoding.educationsystem.utils.NameGenerator;
import com.bootcoding.educationsystem.utils.PhoneNumberGenerator;

public class StudentService
{
    public static void main(String[] args)
    {
        StudentService studentService = new StudentService();
        studentService.createRandomStudents();
    }


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
}
