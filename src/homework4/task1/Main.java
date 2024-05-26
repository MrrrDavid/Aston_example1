package homework4.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> countriesWorld = new ArrayList<>();

        countriesWorld.add("China");
        countriesWorld.add("Russia");
        countriesWorld.add("Belarus");

        System.out.println("Добавление: " + countriesWorld);

        countriesWorld.set(1, "Germany");
        System.out.println("Изменение Russia на Germany: " + countriesWorld);

        countriesWorld.remove(1);
        System.out.println("Удаление Germany: " + countriesWorld);

        countriesWorld.remove("China");
        System.out.println("Удаление China: " + countriesWorld);

        System.out.println("Поиск по индексу Belarus: " + countriesWorld.indexOf("Belarus"));

        System.out.println("Содержится ли страна в списке Belarus: " + countriesWorld.contains("Belarus"));
    }
}
