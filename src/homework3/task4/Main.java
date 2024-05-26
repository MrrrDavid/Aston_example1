package homework3.task4;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str.insert(i + 1, ch);
            i++;
        }

        System.out.println(str);


    }
}
