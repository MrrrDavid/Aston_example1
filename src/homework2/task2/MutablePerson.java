package homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {
    private String name;
    private int age;
    private List<String> hobbies = new ArrayList<>();

    public MutablePerson() {

    }

    public MutablePerson(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void addHobie(String hobby) {
        hobbies.add(hobby);
    }

    public void deleteHobie(int index) {
        hobbies.remove(index);
    }
}
