package ru.otus;

public class TestBox {
    public static void main(String[] args) {
        SuperBox<Integer> x = new SuperBox<Integer>(new Integer[20]);
        SuperBox<Long> f = new SuperBox<>(new Long[20]);

        x.setItem(1);
        x.setItem(10);

        f.setItem(100L);
        f.setItem(44L);

        Integer[] d = x.getSumm();
        int i = 0;

        for (Integer dd : d) {
            while (dd != null) {
                i+=dd;
            }
        }
        System.out.println(i);
    }
}
