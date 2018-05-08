package ru.otus;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList();
        list.add(3);
        java.util.Collections.sort(list);
    }
}
