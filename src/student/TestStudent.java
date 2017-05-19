package student;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maxim");
        student.setSurName("Muzichenko");
        student.setAge(29);

        Student student2 = new Student("Maxim", "Muzichenko", 29);

        System.out.println(student.toString());
        System.out.println(student2.toString());


    }
}
