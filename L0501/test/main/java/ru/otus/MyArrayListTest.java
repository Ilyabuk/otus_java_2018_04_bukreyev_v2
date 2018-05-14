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
        addAll(myList, 1,6,10,3);

        copy(myList,normList);

        assertEquals(normList.size(), 4);
        assertEquals(normList.get(1), new Integer(0));

    }

    @Test
    public void SortTest() {
        addAll(myList, 1, 3, 0, 5);

        sort(myList);
        sort(normList);

        assertArrayEquals(myList.toArray(), normList.toArray());
    }
}
