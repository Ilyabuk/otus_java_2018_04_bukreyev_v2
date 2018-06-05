package ru.otus;

import java.util.Comparator;

public class IamComparable implements Comparable<IamComparable>{
    private String name;
    private int id;

    public IamComparable(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(IamComparable o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "IamComparable{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
