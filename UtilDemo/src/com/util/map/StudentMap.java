package com.util.map;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> studentlist = new HashMap<>();
        Department department1 = new Department("kutku",7,"ece");
        Department department2 = new Department("china",5,"cs");
        Department department3 = new Department("kanan",6,"mech");

        Student student1 = new Student("shiva","varanasi");
        Student student2 = new Student("siva","bangalore");
        Student student3 = new Student("mahadev","bangalore");
        Student student4 = new Student("dev","odc");

        studentlist.put(department1,Arrays.asList(student1,student2,student3,student4));

        System.out.println("Department of ece");
        Set<Department> departmentMap = studentlist.keySet();
        for (Department department : departmentMap){
            System.out.println(department.getDeptName()+" and "+department.getDeptHead()+" ; "+studentlist.get(department));

        }
    }
}
