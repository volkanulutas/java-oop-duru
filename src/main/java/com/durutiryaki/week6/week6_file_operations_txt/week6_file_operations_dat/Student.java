package com.durutiryaki.week6.week6_file_operations_txt.week6_file_operations_dat;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;

    private String firstName;

    private String lastName;

    private int grade;

    public Student(int id, String firstName, String lastName, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", grade=" + grade + '}';
    }
}
