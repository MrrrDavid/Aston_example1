package homework6.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        File file = new File("src/homework6/task2/tst.txt");

        try (FileOutputStream fos = new FileOutputStream(file); FileInputStream fis = new FileInputStream(file)) {
            fos.write(str.getBytes(StandardCharsets.UTF_8));
            int i;
            while ((i = fis.read()) != -1) {
                if ((char) i == ' ') {
                    System.out.print('_');
                    continue;
                }
                System.out.print((char) i);
            }
        }

    }
}
