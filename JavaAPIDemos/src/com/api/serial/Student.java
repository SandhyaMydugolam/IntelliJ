package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 2L;
   private String studentname;
    private int studentid;
     private transient String studentdepartment;

    public Student() {

    }

    public Student(String studentname, int studentid, String studentdepartment) {
        this.studentname = studentname;
        this.studentid = studentid;
        this.studentdepartment = studentdepartment;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setstudentname(String studentname) {
        studentname = studentname;
    }

    public int getstudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        studentid = studentid;
    }

    public String getstudentdepartment() {
        return studentdepartment;
    }

    public void setstudentdepartment(String studentdepartment) {
        studentdepartment = studentdepartment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Studentname='" + studentname + '\'' +
                ", Studentid=" + studentid +
                ", Studentdepartment='" + studentdepartment + '\'' +
                '}';
    }
}
