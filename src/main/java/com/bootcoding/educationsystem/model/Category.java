package com.bootcoding.educationsystem.model;

import java.util.ArrayList;
import java.util.Date;

public class Category
{
    private int id;
    private String category;
    private ArrayList<Package> packages;
    private Date create_date;
    private String create_by;
    private Date modified_date;
    private String modified_by;
}
