package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse course = () -> new String[]{"html", "css", "bootstrap"};
        String[] webCourses = course.showCourse();
        System.out.println("web Courses:");
        for (String course1 : webCourses) {
            System.out.println(course1);
        }
        course = () -> new String[]{"aws", "cloud", "Azure"};
        String[] cloudCourses = course.showCourse();
        System.out.println("cloud Courses:");
        for (String course1 : cloudCourses) {
            System.out.println(course1);



        }
    }
    }

