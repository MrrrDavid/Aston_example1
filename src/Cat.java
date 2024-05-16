public class Cat extends Animal {

    static {
        System.out.println("Класс Cat был загружен");
    }

    {
        System.out.println("Объект класса Cat был создан");
        //значения по умолчанию. Можно задать в нестатическом блоке или проинициализировать сразу при создании переменной
        isTail = true;
        isShortHair = false;
    }

    private boolean isShortHair;
    private boolean isTail;

    public Cat() {
    }

    public Cat(String name, String breed, int age, float weight) {
        super(name, breed, age, weight);
    }

    public Cat(String name, String breed, int age, float weight, boolean isShortHair, boolean isTail) {
        super(name, breed, age, weight);
        this.isShortHair = isShortHair;
        this.isTail = isTail;
    }

    @Override
    public void voice() {
        System.out.println(getName()+" meow");
    }

    public void voice(int count) {
        System.out.print(getName());
        for (int i = 0; i < count; i++) {
            System.out.print(" meow ");
        }
        System.out.println();
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " ходит на 4 лапах");
    }

    @Override
    public void display() {
        System.out.println("Cat: \n" + "имя: " + super.getName() + ", порода: " + super.getBreed()
                + ", возраст: " + super.getAge() + ", вес: " + super.getWeight()
                + ", короткая шерсть?: " + (isShortHair ? "да" : "нет") + ", есть хвост?: " + (isTail ? "да" : "нет"));
    }

    public boolean isTail() {
        return isTail;
    }

    public void setTail(boolean tail) {
        isTail = tail;
    }

    public boolean isShortHair() {
        return isShortHair;
    }

    public void setShortHair(boolean shortHair) {
        isShortHair = shortHair;
    }
}
