package main.java.student;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class TestGroup {
    public static void main(String[] args) {

        Student student1 = new Student("Watsgen", "Muzich", 29);
        Student student2 = new Student("Max", "Muzi", 29);
        Student student3 = new Student("Wac", "Muzichenko", 29);
        Student student4 = new Student("Ma5", "Muzichenko", 27);
        Student student7 = new Student("Andrey", "Kor", 27);

        Group group = new Group(20, 3);
        group.showStudents();


        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student7);
        group.addStudent(student4);


          group.showStudents();
        // Arrays.sort(students);
        //group.showStudents();

        System.out.println("***********************");
      /* // group.removeStudent(0);
        group.showStudents();
        System.out.println("***********************");
        group.updateStudent(student1, 2);
        group.showStudents();

        System.out.println("***********************");

        group.sortByName();
        group.showStudents();
        System.out.println("*********************");
*/
    }
}
