package homework2.task3;

public class Main {
    public static void main(String[] args) {

        Computer.Processor processor = new Computer.Processor("i5");
        System.out.println("Процессор: " + processor.getDetails());

        Computer computer = new Computer();
        Computer.Ram ram = computer.new Ram("8");
        System.out.println("Память: "+ram.getDetails());

    }
}
