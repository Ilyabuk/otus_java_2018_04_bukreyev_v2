package ru.otus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersTest2 {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Mike", 10);
        Person p2 = new Person("Mike", 10);

        map.put(p1, "lala");
        map.put(p2, "lala");

        System.out.println(map);

        {
//        PersonComparator comparator = new PersonComparator();
//        Set<Person> personSet = new LinkedHashSet<>();
//
//        Person p1 = new Person("Ozerov");
//        Person p2 = new Person("Batalenko");
//        Person p3 = new Person("Gudkov");
//        Person p4 = new Person("Vaynerman");
//        Person p5 = new Person("Lukyanchenko");
//        Person p6 = new Person("Laputin");
//
//        Collections.addAll(personSet, p1,p2,p3,p4,p5,p6);
//        System.out.println(personSet);
        }
    }
}
