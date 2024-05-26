package homework3.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[3];

        Scanner scanner = new Scanner(System.in);

        int averageLengthStr;
        int maxLength = 0;

        for (int i = 0; i < strings.length; i++) {
            String str = scanner.nextLine();
            strings[i] = str;
            maxLength += str.length();
        }

        averageLengthStr = maxLength / strings.length;

        System.out.println("Средняя длина строк: "+averageLengthStr);

        for (String str : strings) {
            if (str.length() < averageLengthStr) {
                System.out.println("Строка: " + str + " Длина строки: " + str.length());
            }
        }

    }
}
