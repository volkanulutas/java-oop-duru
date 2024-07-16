package com.durutiryaki.week6.week6_file_operations_dat;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentFileReader {
    public static Student readFromFile(String fileName) {
        Student student = null;
        try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
            student = (Student) ois.readObject();
            System.out.println("Student object read from file: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void main(String[] args) {
        Student student = readFromFile("student.dat");
        System.out.println(student.getFirstName());
    }
}
