package List.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E element) {
        enSurecapacity();
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        enSurecapacity();
//        validateIndex(index);
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void enSurecapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }

    public void validateIndex(int index) {
        if (index < 0 || index <= size) {
            throw new IndexOutOfBoundsException(String.format("%d out of %d array", index, size));
        }
    }

    public E remove(int index) {
        validateIndex(index);
        E result = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public Object clone() {
        MyList<E> result = new MyList<>(size);
        for (int i = 0; i <= size; i++) {
            result.add((E) elements[i]);
        }
        return result;
    }

        public boolean contains(E e) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                result = true;
                break;
            }
        }
        return result;

    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i] + " ");
        }
    }

    public int indexOf(E o) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                result = i;
            }
        }
        return result;
    }

    public void clear() {
        elements = null;
    }
}


