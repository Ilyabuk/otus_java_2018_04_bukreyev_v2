package ru.otus;

import java.util.ArrayList;
import java.util.List;

public class SupplierClass {
    private List<Integer> list;
    private Double d = 99999.000009999;

    public SupplierClass() {
        this.list = new ArrayList(10000);
        for (int i = 0; i < list.size(); i++) {
            list.add(i);
        }
    }

    public void printElem() {
        for (Integer k : list) {
            System.out.println(k);

        }
    }
}
