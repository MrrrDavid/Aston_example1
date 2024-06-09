package homework3.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        String maxLengthStr="";
        String minLengthStr="";

        for (int i = 0; i < 3; i++) {

            String str = scanner.nextLine();

            int lengthStr = str.length();

            if (lengthStr > maxLength) {
                maxLength = lengthStr;
                maxLengthStr = str;
            }
            if (lengthStr < minLength) {
                minLength = lengthStr;
                minLengthStr = str;
            }
        }

        System.out.println("Максимальная длина строки: " + maxLength + " строка: " + maxLengthStr);
        System.out.println("Минимальная длина строки: " + minLength + " строка: " + minLengthStr);
    }
}
