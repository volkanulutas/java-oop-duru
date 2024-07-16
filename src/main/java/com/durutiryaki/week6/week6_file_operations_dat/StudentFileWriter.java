package com.durutiryaki.week6.week6_file_operations_dat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFileWriter {
    public static void writeToFile(String fileName, Student student) {
        try (FileOutputStream fos = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            System.out.println("Student object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Ali", "Yılmaz", 90);
        writeToFile("student.dat", student);
    }
}
