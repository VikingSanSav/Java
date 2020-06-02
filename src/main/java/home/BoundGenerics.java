package home;

import java.util.ArrayList;
import java.util.List;

public class BoundGenerics {
    static class Animal {
        void feed() {
            System.out.println("Animal");
        }
    }
    static class Cat extends Animal {
        void mew() {
            System.out.println("cat mew");
        }
    }

    public static void main (String... args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<? extends Animal> animals = cats;
        for (Cat l: cats) {
            System.out.println(l.hashCode());
            l.mew();}


    }

}
