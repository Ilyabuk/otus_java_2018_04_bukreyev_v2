package ru.otus;

import java.util.Set;
import java.util.TreeSet;

public class PersTest {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        Person p1 = new Person("Vasya", 1);
        Person p2 = new Person("Petr", 2);
        Person p3 = new Person("Praskovya", 4);
        Person p4 = new Person("AnastasiyaBalabanova", 3);
        Person p5 = new Person("Yan", 5);

        addPers(personSet, p1);
        addPers(personSet, p2);
        addPers(personSet, p3);
        addPers(personSet, p4);
        addPers(personSet, p5);

        print(personSet);
    }

    static void addPers(Set<Person> s, Person p) {
        s.add(p);
    }

    static void print(Set<Person> p) {
        for (Person elem : p) {
            System.out.printf("%s;", elem.toString());
        }
    }
}
