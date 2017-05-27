package week2.data_Strukture;

/**
 * Created by Sherlock on 27.05.2017.
 */
public interface MyCollection {
    boolean add (Object o);
    boolean contains (Object o);
    void clear();
    boolean isEmpty();
    boolean remove(Object o);
    int size();
}
