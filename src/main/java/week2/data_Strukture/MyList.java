package week2.data_Strukture;

/**
 * Created by Sherlock on 27.05.2017.
 */
public interface MyList extends MyCollection {

    boolean add(Object o , int index);
    Object get(int index);
    Object remove(int index);
    boolean set(Object o , int index);

}
