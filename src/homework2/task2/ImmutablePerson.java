package homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePerson {
    private String name;
    private int age;
    private List<String> hobbies = new ArrayList<>();



    public ImmutablePerson() {
    }

    public ImmutablePerson(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }


}
