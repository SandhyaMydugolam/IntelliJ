package com.api.serial;

import java.io.*;

public class SerialDemo {
    public static <student> void main(String[] args) throws IOException {
  Student student = new Student("sri",10,"cse");
        System.out.println("Serializing");
        try (
            FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
    objectOutputStream.writeObject(student);
            System.out.println("completed");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
