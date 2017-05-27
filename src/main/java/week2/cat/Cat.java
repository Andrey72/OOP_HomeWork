package week2.cat;

import java.util.ArrayList;

/**
 * Created by Sherlock on 27.05.2017.
 */
public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        cats.add(this);
    }


    public void printCats() {
        System.out.println(cats.toString());
    }

    public String toString() {
        return String.format(" Name cat - %s , age - %d\n", name, age);
    }
}
