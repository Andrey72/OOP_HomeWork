package main.java.student;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class TestUniversity {
    public static void main(String[] args) {

        Student student1 = new Student("Vatsgen", "Muzich", 29);
        Student student2 = new Student("Max", "Muzi", 29);
        Student student3 = new Student("Wacgen", "Muzichenko", 29);
        Student student4 = new Student("Ma5", "Muzichenko", 27);

        Group group1 = new Group(20, 3);
        group1.addStudent(student1);
        group1.addStudent(student2);

        Group group2 = new Group(21, 3);
        group2.addStudent(student3);
        group2.addStudent(student4);

        University university = new University("KPI", 3);
        university.showUniver();

        university.addGroup(group1);
        university.addGroup(group1);
        university.showUniver();

        university.removeGroup(0);
        university.showUniver();
    }
}
