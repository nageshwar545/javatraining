package Assignment2.collections;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection<TYPE> implements Collection<TYPE> {
    private final Object[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 5;

    public MyCollection() {
        elements = new Object[INITIAL_CAPACITY];
    }

    // Implementing the add() method
    @Override
    public boolean add(TYPE element) {
        if (size == elements.length) {
            System.out.println("Collection is full! Cannot add more elements.");
            return false;
        }
        elements[size++] = element;
        return true;
    }

    // Implementing the remove() method
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                // Shift elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends TYPE> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    // Implementing the size() method
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<TYPE> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();

        // Adding elements
        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Cherry");

        System.out.print("After adding elements: ");

        // Checking size
        System.out.println("Size: " + myCollection.size());  // Output: 3

        // Removing an element
        myCollection.remove("Banana");

        System.out.print("After removing 'Banana': ");

        // Checking size after removal
        System.out.println("Size: " + myCollection.size());  // Output: 2
    }
}
