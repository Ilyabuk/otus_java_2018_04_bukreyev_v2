package main.java.ru.otus;

import ru.otus.MyArrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.*;
import static org.junit.Assert.*;

public class MyArrayListTest {
    private List<Integer> myList;
    private List<Integer> normList;

    @Before
    public void init() {
        myList = new MyArrayList<>();
        normList = Arrays.asList(3, 0, 1, 5);
    }

    @Test
    public void AddAllTest() {
        addAll(myList, 3, 0, 5, 1);

        assertEquals(normList.size(), myList.size());
        assertEquals(normList.get(0), myList.get(0));
    }

    @Test
    public void CopyTest() {
//        myList.add(1);
//        myList.add(6);
//        myList.add(10);
//        myList.add(3);

        System.out.println(normList);
        copy(myList,normList);
        System.out.println(myList.toString());

        assertEquals(normList.size(), 4);
        assertEquals(normList.get(1), new Integer(0));

    }

    @Test
    public void SortTest() {
        myList.add(4);
        myList.add(2);
        myList.add(0);

        sort(myList);
        sort(normList);

//        System.out.println(normList.getClass());
//        System.out.println(myList.getClass());
//        assertEquals(normList.size(), myList.size());
        Object[] a = normList.toArray();
        Object[] b = myList.toArray();
        assertArrayEquals(a, b);
    }
}
