package ru.otus;

import java.util.Objects;

public class Pesiki implements Comparable<Pesiki> {
    String name;
    int id;

    public Pesiki(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pesiki{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Pesiki o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pesiki pesiki = (Pesiki) o;
        return id == pesiki.id &&
                Objects.equals(name, pesiki.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id);
    }
}
