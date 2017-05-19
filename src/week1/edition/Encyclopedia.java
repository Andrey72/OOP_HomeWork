package edition;

/**
 * Created by Sherlock on 19.05.2017.
 */
 class Encyclopedia extends Book implements Edition {

    private int pages;

    Encyclopedia(String name, String dataOfIssue, double prise ,int pages) {
        super(name, dataOfIssue, prise);
        this.pages = pages;
    }




    @Override
    public void show() {
        String res = String.format("Data of inssue - %s , my prise - %f , size - %d ",
                                    dataOfIssue , prise, pages) ;
        System.out.println(res );
    }

    @Override
    public void getBookType() {
        System.out.println("I'm Encyclopedia :" + this.name);
    }
}
