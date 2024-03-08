package com.api.serial;

import java.io.*;

public class DeSerialDemo {
    public static <student> void main(String[] args) throws IOException {

        try (FileInputStream fileinputStream = new FileInputStream("stud.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileinputStream);
        ){
            Student student = (Student)objectInputStream.readObject();
            System.out.println(student);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
