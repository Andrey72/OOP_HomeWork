package main.java.student;

import java.util.Arrays;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Group {

    private int groupNumber;
    private Student[] students;
    private int size;
    private int count = 0;


    public Group(int groupNumber, Student[] students) {
        this.groupNumber = groupNumber;
        this.students = students;

    }

    public Group(int groupNumber, int size) {
        this.groupNumber = groupNumber;
        this.size = size;
        this.students = new Student[size];
    }

    @Override
    public String toString() {
        return String.format("Group nuber - %d", groupNumber);
    }


    public boolean addStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (student.equals(students[i])) {
                return false;
            }
        }
        if (student == null || size == count) {
            System.out.println("Full group!");
        } else {
            students[count++] = student;
            return true;
        }
        return false;
    }


    public void showStudents() {
        System.out.println("Group number - " + groupNumber);
        System.out.println(Arrays.toString(students));
    }

    public boolean removeStudent(int position) {
        if (position < 0 || size <= position) {
            System.out.println("Student don't exist");
            return false;
        } else {
            System.arraycopy(students, position + 1, students, position, size - position - 1);
            students[size - 1] = null;
            size--;
            return true;
        }
    }

/*

    public String asString() {

        String info = "";

        for (int i = 0; i < students.length; i++) {

            info += students[i] == null ? null : students[i].toString();

            info += "\n";
        }

        return String.format("Group number - %d\nStudents:\n%s", groupNumber, info);
    }
*/

    public void updateStudent(Student student, int index) {
        if (student == null || index < 0 || index > students.length - 1) {
            System.out.println("Can not be replaced");
        } else {
            students[index] = student;
        }
    }

    public void sortByName() {
        Student temp = new Student();
        for (int i = students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 1) {

                   /* temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;*/
                }
            }

        }
    }


    public boolean equals(Object group) {
        if (group == null || !(group instanceof Group)) return false;
        Group temp = (Group) group;
        if (this == group) return true;

        for (int i = 0; i < size; i++) {
            if (!this.students[i].equals(temp.students[i])) return false;
            if (this.size != temp.size) return false;
        }

        return true;
    }

}