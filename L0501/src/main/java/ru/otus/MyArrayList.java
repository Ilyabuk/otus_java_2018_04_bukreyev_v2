package ru.otus;

import java.util.*;

/**
 * Created otusjava by Ilya on 5/1/18.
 */
public class MyArrayList<T> implements List<T>, Comparator {

    final private int INITIAL_SIZE = 16;
    private int size;
    private Object[] data;

    public MyArrayList(int initSize) {
        data = new Object[initSize];
        size = 0;
    }

    public MyArrayList() {
        data = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (data.length == size) {
            increaseCapacity();
        }
        data[size++] = t;
        return true;
    }

    private void increaseCapacity() {
        Object[] newData = new Object[size * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
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

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {

        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int i = 0;
        int k = 0;
        try {
            i = (int) o1;
            k = (int) o2;
        } catch (ClassCastException error) {
            System.out.printf("%s", error);
        }
        return Integer.compare(i, k);
    }

    private class MyIterator implements Iterator<T> {
        private int cursor;
        private int lastRet = -1;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public T next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = MyArrayList.this.data;
            if (i >= MyArrayList.this.data.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (T) elementData[lastRet = i];
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Object e : data) {
            if (e != null) {
                s += e.toString() + ", ";
            }
        }
        return s;
    }

//    @Override
//    public void sort(Comparator<? super T> c) {
//        Integer[] array = (Integer[]) data;
//        c.
//    }
}
