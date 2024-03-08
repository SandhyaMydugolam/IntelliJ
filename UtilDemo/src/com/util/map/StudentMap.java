package com.util.map;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> studentlist = new HashMap<>();
        Department department1 = new Department("kutku",7,"ece");
        Department department2 = new Department("china",5,"cs");
        Department department3 = new Department("kanan",6,"mech");

        studentlist.put(department1,
                Arrays.asList(new Student("ram","blr"),new Student("joe","blr")));
        studentlist.put(department2,
        )
    }
}
