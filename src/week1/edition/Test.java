package week1.edition;

/**
 * Created by Sherlock on 19.05.2017.
 */
public class Test {
    public static void main(String[] args) {

        Jurnal jurnal1 = new Jurnal("Focus", "15.05.17", 30.50, "Information-political");
        Jurnal jurnal2 = new Jurnal("Focus2", "15.05.17", 30.50, "Information");

        Encyclopedia encyclopedia1 = new Encyclopedia("Animals", "20.08.16", 100.20, 300);
        Encyclopedia encyclopedia2 = new Encyclopedia("Encyclopedia of Cold Steel", "20.08.16", 320.20, 100);


        jurnal1.getBookType();
        jurnal1.show();
        jurnal1.getEditionName();

        System.out.println();
        encyclopedia2.getBookType();
        encyclopedia1.show();


    }
}
