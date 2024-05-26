package homework2.task1;


public class Main {

    public static void main(String[] args) {

        Car sedan = new Sedan("A", "бензин", 5, 200);

        Car truck = new Truck(3, "дизель", 1000, 5000);

        System.out.println("Седан");
        System.out.println("Количество дверей: " + sedan.getNumberOfDoors());
        System.out.println("Объем багажника: " + sedan.getTrunkCapacity());
        System.out.println("Тип топлива: " + sedan.getFuelType());
        System.out.println("Класс автомобиля: " + ((Sedan) sedan).getLuxuryLevel());
        sedan.start();
        sedan.stop();

        System.out.println();

        System.out.println("Грузовик");
        System.out.println("Тип топлива: " + truck.getFuelType());
        System.out.println("Объем багажника: " + truck.getTrunkCapacity());
        System.out.println("Количество дверей: " + truck.getNumberOfDoors());
        System.out.println("Максимальная загрузка грузовика: " + ((Truck) truck).getMaxLoadCapacity());
        truck.start();
        truck.stop();
    }
}
