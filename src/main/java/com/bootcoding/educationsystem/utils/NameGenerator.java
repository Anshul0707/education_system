package com.bootcoding.educationsystem.utils;

import java.util.Random;

public class NameGenerator
{
    private static String[] names =
            {"Anshul", "Minal", "Suvidhnya", "Harshal",
                    "Mahesh", "Milind", "Akash", "Pranit",
                    "Nikhil", "Tejal", "Priyal",
                    "Rohini"};

    public static String getName() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        NameGenerator.getName();
    }
}
