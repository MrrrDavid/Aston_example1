package homework2.task2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ImmutablePerson immutablePerson = new ImmutablePerson("Иван", 20, new ArrayList<>(Arrays.asList("Игра на фортепиано", "программирование", "оригами")));
        MutablePerson mutablePerson = new MutablePerson("Петр", 20, new ArrayList<>(Arrays.asList("поделки", "рисование", "занятие спортом")));

        System.out.println("Объект immutablePerson");

        System.out.println("Проверяем изменяемость List hobbies.\n" +
                "Присваиваем ссылку ArrayList hobbies другому ArrayList.\n" +
                "Добавляем в новый ArrayList значение \"Автомобили\"\n");

        List<String> immutableList = immutablePerson.getHobbies();
        immutableList.add("Автомобили");

        System.out.println("Список immutablePerson: "+immutablePerson.getHobbies());
        System.out.println("Список новый: "+immutableList);

        System.out.println();

        System.out.println("Объект mutablePerson");
        System.out.println("Изменение имени с помощью setName()");
        System.out.println("Было имя: "+ mutablePerson.getName());
        mutablePerson.setName("Владислав");
        System.out.println("Стало имя: "+ mutablePerson.getName());

        System.out.println();

        System.out.println("Изменение возраста с помощью setAge()");
        System.out.println("Был возраст: "+mutablePerson.getAge());
        mutablePerson.setAge(60);
        System.out.println("Стал возраст: "+mutablePerson.getAge());

        System.out.println();

        System.out.println("ArrayList может быть изменен с помощью метода addHobbies, deleteHobbies," +
                "\nа также с помощью присваивания ссылки arrayList другому списку.");

        System.out.println("Изменение с помощью add. Добавляем строку \"Катание на велосипеде\"");
        System.out.println("Было: "+ mutablePerson.getHobbies());
        mutablePerson.addHobie("Катание на велосипеде");
        System.out.println("Стало: "+ mutablePerson.getHobbies());

        System.out.println();

        System.out.println("Изменение с помощью delete. Удаляем строку \"Катание на велосипеде\" по индексу");

        System.out.println("Было: "+ mutablePerson.getHobbies());
        mutablePerson.deleteHobie(3);
        System.out.println("Стало: "+ mutablePerson.getHobbies());

        System.out.println();

        System.out.println("Создаем новым список и присваеваем сслыку mutablePerson.getHobbies()");
        List<String> mutableList = mutablePerson.getHobbies();

        System.out.println("Добавляем в mutableList строку \"Починка компьютеров\"");
        mutableList.add("Починка компьютеров");

        System.out.println("Выводим хобби у mutablePerson и у списка mutableList");
        System.out.println("mutablePerson: "+ mutablePerson.getHobbies());
        System.out.println("mutableList: "+ mutableList);
    }
}
