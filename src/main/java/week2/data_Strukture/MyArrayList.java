package week2.data_Strukture;

/**
 * Created by Sherlock on 27.05.2017.
 */
public class MyArrayList implements MyList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);

    }

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
    }

    @Override
    public boolean add(Object o) {
        if (size == elementData.length) ensureCapacity();
        elementData[size++] = o;
        return true;
    }

    private void ensureCapacity() {
        Object[] newElementData = new Object[(elementData.length * 3) / 2 + 1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    @Override
    public boolean contains(Object o) {

        return indexOf(o) >= 0;
    }

    private int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
            size = 0;
        }
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (o == elementData[i]) {
                    System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                    elementData[size--] = null;
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                elementData[size--] = null;
                return true;
            }
        }
        return false;

    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean add(Object o, int index) {
        System.arraycopy(elementData , index, elementData , index + 1, size - 1 );
        elementData[index] = o;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index > size -1) return null;

        int numMoved = size - index - 1;
        if (numMoved > 0 )
            System.arraycopy(elementData , index + 1 , elementData , index , numMoved);
        elementData[--size] = null;
        return  true;
    }

    @Override
    public boolean set(Object o, int index) {
      if (index < 0 || index > size - 1) return false;
        elementData[index] = o;
        return true;
    }
}
