package main.java.student;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Student implements Comparable {

    private String name;
    private String surname;
    private int age;

    public Student() {
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return String.format("Student name - %s, surName - %s, age - %d",
                name, surname, age);
    }


    public boolean equals(Student student) {

        if (student == null) return false;
        if (student == this) return true;

        if (this.name.equals(student.name) &&
                this.surname.equals(student.surname) &&
                this.age == student.age) {
            return true;
        }

        return false;
    }

    @Override
    public int compareTo(Object o) {

        Student student = (Student) o;
        int compareToresult = this.name.compareTo(student.name);
        if (compareToresult != 0) return compareToresult;
        compareToresult = this.surname.compareTo(student.surname);
        return 0;
    }
}
