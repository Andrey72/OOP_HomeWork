package Edition;

/**
 * Created by Sherlock on 19.05.2017.
 */
 abstract class Book implements Edition {

    protected String name;
    protected String dataOfIssue;
    protected double prise;


    public Book(String name, String dataOfIssue, double prise) {

        this.name = name;
        this.dataOfIssue = dataOfIssue;
        this.prise = prise;
    }

    @Override
    public void getEditionName() {
        System.out.println(String.format("Title edition - %s, data of issue -  %s ",
                name, dataOfIssue));
    }

    abstract public void show();


}

