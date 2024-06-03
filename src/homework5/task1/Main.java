package homework5.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(i);
        }

        for (int i = 0; i <= 20; i++) {
            list.add(i);
        }

        System.out.println(list);

        List<Integer> list1 = list.stream()
                .distinct()
                .toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(list2);

        int sum = list2.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);

    }
}
