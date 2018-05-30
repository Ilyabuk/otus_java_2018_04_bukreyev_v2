package ru.otus;

public class Box {
    private static int i;
    private Object[] o;

    public Box(Object[] o) {
        this.o = o;
    }

    public Object getO(int index) {
        return o[index];
    }

    public void add (Object o) {
        this.o[i++] = o;
    }
}
