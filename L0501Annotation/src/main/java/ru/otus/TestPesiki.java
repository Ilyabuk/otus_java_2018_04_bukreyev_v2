package ru.otus;

/*
Comparator, Comparable
 */

import java.util.*;

public class TestPesiki {
    public static void main(String[] args) {
        TestPesiki t = new TestPesiki();
        t.start();

    }

    private void start() {
        Pesiki p1 = new Pesiki("Bob", 2);
        Pesiki p2 = new Pesiki("Zhulya", 4);
        Pesiki p3 = new Pesiki("Bobik", 1);
        Pesiki p4 = new Pesiki("Tashkent", 8);


        List<Integer> integerList = new ArrayList<>();
        Set<Pesiki> pesikiSet = new TreeSet<Pesiki>();
        Map<Pesiki, Integer> pesikiMap = new HashMap<>();
        List<Pesiki> pesikiList = new ArrayList<>();

        integerList.add(4);
        integerList.add(3);
        integerList.add(7);
        integerList.add(1);
        integerList.add(88);
        integerList.add(6);

        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

        pesikiSet.add(p1);
        pesikiSet.add(p2);
        pesikiSet.add(p3);
        pesikiSet.add(p4);

//        System.out.println(pesikiSet);

        pesikiMap.put(p1, 4);
        pesikiMap.put(p2, 3);
        pesikiMap.put(p3, 8);
        pesikiMap.put(p4, 1);

        pesikiList.add(p1);
        pesikiList.add(p2);
        pesikiList.add(p3);
        pesikiList.add(p4);

        Collections.sort(pesikiList, new PesikComparator());

//        System.out.println(pesikiList);
    }

    private class PesikComparator implements Comparator<Pesiki> {

        @Override
        public int compare(Pesiki o1, Pesiki o2) {
            if (o1.name.length() < o2.name.length()) {
                return -1;
            } else if (o1.name.length() > o2.name.length()) {
                return 1;
            } else return 0;
        }
    }
}
