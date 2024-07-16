package com.durutiryaki.week6.week6_file_operations_txt.week6_file_operations_dat;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFileWriter {
    public static void writeToFile(String fileName, Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(student.getId() + "," + student.getFirstName() + "," +
                    student.getLastName() + "," + student.getGrade());
            System.out.println("Student object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Ali", "Yılmaz", 90);
        writeToFile("student.txt", student);
    }
}
