package List_Basic.List;

import java.util.Arrays;

public class List<E> {
    private int size = 0;
    private static final int DEFAUT_CAPACITY = 10;
    private Object[] elements;

    public List() {
        elements = new Object[DEFAUT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size" + i);
        }
        return (E) elements[i];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
}
