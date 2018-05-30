package ru.otus;

public class SuperBox<T extends Number> {

    private T[] item;
    private static int index;

    public SuperBox(T[] item) {
        this.item = item;
    }

    public void setItem(T i) {
        this.item[index++] = i;
    }

    public T getItem(int index) {
        return item[index];
    }

    public T[] getSumm() {
        return item;
    }
}

