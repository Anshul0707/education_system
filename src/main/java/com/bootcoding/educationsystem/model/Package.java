package com.bootcoding.educationsystem.model;

import java.util.ArrayList;
import java.util.Date;

public class Package
{
    private int id;
    private String packageName;
    private String duration;
    private ArrayList<Course> courses;
    private Date create_date;
    private String create_by;
    private Date modified_date;
    private String modified_by;
}
