package homework4.task3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println(person);
        }

        people.remove(person1);
        people.remove(person3);

        for (Person person : people) {

            if (person.equals(person2)) {
                System.out.println(true);
            }

        }
    }
}

