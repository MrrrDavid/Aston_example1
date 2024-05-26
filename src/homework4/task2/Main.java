package homework4.task2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();

        countries.addLast("China");
        countries.addLast("Russia");

        countries.addFirst("Belarus");
        countries.addFirst("Kazakhstan");

        System.out.println(countries);

        countries.removeFirst();
        countries.removeLast();

        System.out.println(countries);

        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());

    }
}
