package ru.otus;

import java.util.ArrayList;
import java.util.List;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

public class MemConsumpt {
        @SuppressWarnings("restriction")
        public static void main(String[] args) {


            System.out.println(ClassLayout.parseClass(ArrayList.class).toPrintable());
            System.out.println(ClassLayout.parseClass(ArrayList.class).toPrintable());
            System.out.println(GraphLayout.parseInstance().toPrintable());
            System.out.println(GraphLayout.parseInstance().toFootprint());
        }
    }
