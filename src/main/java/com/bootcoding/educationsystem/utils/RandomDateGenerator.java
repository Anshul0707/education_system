package com.bootcoding.educationsystem.utils;

import java.util.Random;

public class RandomDateGenerator
{

    public static int getRandomDate()
    {
        Random random = new Random();
        int date = random.nextInt(10);
        return date;
    }

    public static void main(String[] args)
    {
        RandomDateGenerator.getRandomDate();
    }
}
