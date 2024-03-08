package com.util.map;

public class Student {
    private String studentname;
    private String city;

    public Student() {
    }

    public Student(String studentname, String city) {
        this.studentname = studentname;
        this.city = city;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

