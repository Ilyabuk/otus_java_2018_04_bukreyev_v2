package main.java.ru.otus;

import org.junit.Before;
import org.junit.Test;
import ru.otus.MyArrayList;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class MyArrayListTest {
    private List<Integer> myList;
    private List<Integer> normList;

    @Before
    public void init() {
        myList = new MyArrayList<>();
        normList = Arrays.asList(4, 0, 2);
    }

    @Test
    public void AddAllTest() {
        addAll(myList, 0, 4, 2);

        assertEquals(normList.size(), myList.size());
        assertEquals(normList.get(0), myList.get(0));
    }

    @Test
    public void CopyTest() {
        myList.add(1);
        myList.add(6);
        myList.add(10);

        copy(normList, myList);

        assertEquals(normList.size(), 3);
        assertEquals(normList.get(1), new Integer(6));
    }

    @Test
    public void SortTest() {
        myList.add(4);
        myList.add(2);
        myList.add(0);

        sort(myList);
        sort(normList);

        assertEquals(normList.size(), myList.size());
//        assertArrayEquals(myList.toArray(), normList.toArray());
    }
}
