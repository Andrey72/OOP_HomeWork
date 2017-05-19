package week1.doctor;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Neurosurgeon extends Surgeon {

    private int yearsExperience;


    public Neurosurgeon(String name, int age, String typeWorks, int yearsExperience) {
        super(name, age, typeWorks);
        this.yearsExperience = yearsExperience;
    }

    public void spec() {
        System.out.println("I specialize in brain operations");
    }


}


