package ru.otus;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name.length() < o2.name.length()) {
            return 1;
        }
        if (o1.name.length() > o2.name.length()) {
            return -1;
        } else return 0;
    }
}
