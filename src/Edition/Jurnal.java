package Edition;

/**
 * Created by Sherlock on 19.05.2017.
 */
class Jurnal extends Book implements Edition {

    private String genre;
    Jurnal(String name, String dataOfIssue, double prise, String ganre) {
        super(name, dataOfIssue, prise);
        this.genre = ganre;
    }



    @Override
    public void show() {
        String result = String.format("My ganre - %s , data of issue - %s  and prise - %f",
                                         genre , dataOfIssue , prise);
        System.out.println(result);
    }

    @Override
    public void getBookType() {
        System.out.println(" I'm jurnal :" + this.name);
    }
}
