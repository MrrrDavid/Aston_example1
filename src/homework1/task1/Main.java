package homework1.task1;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Вася", "британская", 10, 5.25f);
        cat.display();

        Animal dog = new Dog("Дог", "Немецкий дог", 6, 20, 10);
        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Количество команд, которые знаеет собака: " + ((Dog) dog).getCountCommand());

        System.out.println();
        Cat cat2 = new Cat();
        cat2.setName("Бонифаций");
        cat2.setAge(5);
        cat2.setBreed("Мейнкун");
        cat2.setWeight(7.43f);
        cat2.setTail(true);
        cat2.setShortHair(false);
        cat2.display();

        cat.voice();
        dog.voice();

        cat.walk();
        dog.walk();

        ((Cat) cat).voice(5);
        ((Dog) dog).voice(5);


    }
}