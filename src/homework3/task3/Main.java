package homework3.task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> uniqString = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            String rezultString = scanner.nextLine();

            String[] rezultStringMas = rezultString.split(" ");

            for (String string : rezultStringMas) {

                if (string.length() <= 2) {
                    continue;
                }

                Set<Character> set = new HashSet<>();

                for (char ch : string.toCharArray()) {
                    set.add(ch);
                }

                if (set.size() == string.length()) {
                    uniqString.add(string);
                }
            }
        }

        System.out.println(uniqString.get(0));
    }
}
