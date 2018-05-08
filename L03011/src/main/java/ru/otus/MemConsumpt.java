package ru.otus;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

public class MemConsumpt {
    @SuppressWarnings("restriction")
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.mtd();

        System.out.println(ClassLayout.parseClass(TestClass.class).toPrintable());
        System.out.println(GraphLayout.parseInstance(test).toPrintable());
        System.out.println(GraphLayout.parseInstance(test).toFootprint());
    }
}
