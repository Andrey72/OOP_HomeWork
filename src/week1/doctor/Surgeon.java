package doctor;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Surgeon implements Doctor {

    private String name;
    private int age;
    private String typeWorks;

    public Surgeon(String name, int age, String typeWorks) {
        this.name = name;
        this.age = age;
        this.typeWorks = typeWorks;

    }


    @Override
    public void showDoctor() {
        System.out.println(String.format("My name is  - %s , I'm - %d , I working  - %s",
                name, age, typeWorks));
    }

    @Override
    public void treatPatient() {
        System.out.println("I operate on their patients");
    }

    @Override
    public void healthCare() {
        System.out.println("I spend surgery!");
    }


}
