package com.durutiryaki.week6.week6_file_operations_txt.week6_file_operations_dat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileReader {
    public static Student readFromFile(String fileName) {
        Student student = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                int grade = Integer.parseInt(parts[3]);
                student = new Student(id, firstName, lastName, grade);
                System.out.println("Student object read from file: " + student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void main(String[] args) {
        Student student = readFromFile("student.txt");
    }
}
