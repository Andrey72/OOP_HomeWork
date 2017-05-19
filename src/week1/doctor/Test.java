package doctor;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        Surgeon surgeon1 = new Surgeon("Sam", 45, " surgeon ");
        Neurosurgeon neurosurgeon1 = new Neurosurgeon("Bob", 45, " neurosurgeon ", 10);

        surgeon1.showDoctor();
        surgeon1.treatPatient();
        surgeon1.healthCare();

        System.out.println();

        neurosurgeon1.showDoctor();
        neurosurgeon1.healthCare();
        neurosurgeon1.treatPatient();
        neurosurgeon1.spec();
    }
}
