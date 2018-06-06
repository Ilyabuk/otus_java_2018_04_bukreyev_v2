package main.java.ru.otus;

import org.junit.Before;
import org.junit.Test;
import ru.otus.IamComparable;
import ru.otus.IamNotComparable;
import ru.otus.MyArrayList;

import java.util.*;

import static java.util.Collections.addAll;
import static java.util.Collections.copy;
import static org.junit.Assert.assertEquals;

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
        addAll(myList, 1, 6, 10, 3);

        copy(myList, normList);

        assertEquals(normList.size(), 4);
        assertEquals(normList.get(1), new Integer(0));

    }

    @Test
    public void SortTest() {

        addAll(myList, 1, 3, 0, 5);
        Collections.sort(myList);
        assertEquals(Integer.valueOf(0), myList.get(0));
    }

    @Test //nothing checked, just example
    public void NotComparable() {
        List<IamNotComparable> n = new ArrayList<>();
        n.add(new IamNotComparable("Petya", 4));
        n.add(new IamNotComparable("Michanya", 1));
        n.add(new IamNotComparable("Dimon", 6));
        n.add(new IamNotComparable("Vovka", 2));

        System.out.println(n);
//        Collections.sort(n); error!
        Collections.sort(n, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));

        System.out.println(n);
    }

    @Test //nothing checked, just example
    public void WellComparable() {
        List<IamComparable> n = new ArrayList<>();
        n.add(new IamComparable("Petya", 4));
        n.add(new IamComparable("Michanya", 1));
        n.add(new IamComparable("Dimon", 6));
        n.add(new IamComparable("Vovka", 2));

        System.out.println(n);
        Collections.sort(n); //now it works!
        System.out.println(n);
    }
}
