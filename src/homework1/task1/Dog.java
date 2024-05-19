package homework1.task1;

public class Dog extends Animal {
    static {
        System.out.println("Загрузился класс homework1.task1.Dog");
    }

    {
        System.out.println("Объект класса homework1.task1.Dog был создан");

    }

    private int countCommand;

    public Dog() {
    }

    public Dog(String name, String breed, int age, float weight, int countCommand) {
        super(name, breed, age, weight);
        this.countCommand = countCommand;
    }

    @Override
    public void display() {
        System.out.println("homework1.task1.Dog: \n" + "имя: " + super.getName() + " порода: " + super.getBreed()
                + " возраст: " + super.getAge() + " вес: " + super.getWeight()
                + " количество команд для дрессировки: " + countCommand);
    }

    @Override
    public void voice() {
        System.out.println("ruff");
    }

    public void voice(int count) {
        System.out.print(getName());
        for (int i = 0; i < count; i++) {
            System.out.print(" ruff ");
        }
        System.out.println();
    }


    @Override
    public void walk() {
        System.out.println(super.getBreed() + " ходит на 4 лапах");
    }

    public int getCountCommand() {
        return countCommand;
    }

    public void setCountCommand(int countCommand) {
        this.countCommand = countCommand;
    }
}
