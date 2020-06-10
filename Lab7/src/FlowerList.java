import java.util.*;
/**
 * @(#) FlowerList.java     1.0 09/06/20
 *
 * Copyright (c) 2020 Saiko Sabrina
 */

/** FlowerList class, which realizes list with size 15 elements and its 30% size increase and has methods
 * and constructors for collection of the flowers
 * @version 1.0 09 June 2020
 * @author Saiko Sabrina
 * @since 1.0
 */

public class FlowerList implements List<Flower>{

    private static final int INIT_SIZE = 15;
    private static final float INCREASE_SIZE = 0.3f;
    private Flower[] flower;
    private int size;

    /**1 (Empty) constructor of FlowerList*/
    public FlowerList() {
        flower = new Flower[INIT_SIZE];
        size = 0;
    }
     /**2 (With 1 object of generalized class) constructor of FlowerList*/
    public FlowerList(Flower flowers) {
        this();
        add(flowers);
    }
    /**3 (with standard collection) constructor of FlowerList*/
    public FlowerList(Collection<Flower> collection) {
        this();
        for (Flower o : collection) {
            add(o);
        }
    }
    /**Realization of all interface methods*/


    public int size() {return size;}


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(flower, size, a.getClass());
        } else {
            System.arraycopy(flower, 0, a, 0, size);
            if (a.length > size) {
                a[size] = null;
            }

            return a;
        }
    }

    /**Method which realize the interface of Iterator */
    public Iterator<Flower> iterator() {
        return new Iterator<Flower>() {
            /**@param ccurrentIndex*/
            int currentIndex = 0;
            /**
             * Method, which checks if the next element exists
             */
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }
            /**
             * Method,which have next element of the collection
             * @return element of flower;
             */
            @Override
            public Flower next() {
                return flower[currentIndex++];

            }
        };
    }
    /**
     * Method, which convert collection to array
     */
    @Override
    public Object[] toArray() { return Arrays.copyOf(flower, size); }


    /**
     * Method, which adds elements to the collection of flower
     */
    public boolean add(Flower flowers) {
        if (size == flower.length) {
            resize();
        }
        flower[size++] = flowers;
        return true;
    }
    /**
     * Method, which resize the array when 30% overflow
     */
    private void resize() {
        int newSize = (int)(flower.length *
                (1+INCREASE_SIZE));
        Flower[] newElements = new Flower[newSize];
        for (int i = 0; i < flower.length; i++) {
            newElements[i] = flower[i];
        }
        flower = newElements;
    }
    /**
     * Method, which remove the object
     */
    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends Flower> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends Flower> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
    }

    public Flower get(int index) {
        return null;
    }

    public Flower set(int index, Flower propositions) {
        return null;
    }

    public void add(int index, Flower propositions) {
    }

    public Flower remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<Flower> listIterator() {
        return null;
    }

    public ListIterator<Flower> listIterator(int index) {
        return null;
    }

    public List<Flower> subList(int fromIndex, int toIndex) {
        return null;
    }
}
