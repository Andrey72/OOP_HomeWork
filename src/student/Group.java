package student;

import java.util.Arrays;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Group {

    private int groupNumber;
    private Student[] students;
    private int size;
    private int countSt = 0;


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
    public String toString(){
        return String.format("Group nuber - %d", groupNumber);
    }


    public Student[] addStudent(Student student) {
        if (countSt == size) {
            System.out.println("Full group!");
        } else {
            students[countSt] = student;
            countSt++;
        }
        return students;
    }


    public void showStudents() {
        System.out.println("Group number - " + groupNumber);
        System.out.println(Arrays.toString(students));
    }

    public void removeStudent(int countSt) {
        if (countSt < 0 || students.length - 1 < countSt) {
            System.out.println("Student don't exist");
        } else {
            Student[] temp = new Student[students.length - 1];

            System.arraycopy(students, countSt + 1, temp, 0, temp.length - countSt);
            System.arraycopy(students, 0, temp, temp.length - countSt, countSt);

            students = temp;
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
        if (  student == null || index < 0 || index > students.length - 1){
            System.out.println("Can not be replaced");
        }
        else{
            students[index] = student;
        }
    }
    public void sortByName(){
        Student temp = new Student();
        for (int i = students.length - 1 ; i > 0 ; i--) {
            for(int j = 0; j < i ; j++){
                if (students[j].getName().compareTo(students[j+1].getName()) > 1){
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j+1] = temp;
                }
            }

        }
    }
}
