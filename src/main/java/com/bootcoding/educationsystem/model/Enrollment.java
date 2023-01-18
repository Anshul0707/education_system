package com.bootcoding.educationsystem.model;

import java.util.ArrayList;
import java.util.Date;

public class Enrollment
{
    private int id;
    private Date enrollment_date;
    private ArrayList<Student> students;
    private ArrayList<Package> packages;
    private Date create_date;
    private String create_by;
    private Date modified_date;
    private String modified_by;
}
