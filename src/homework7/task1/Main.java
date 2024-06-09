package homework7.task1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {

        Good good = new Good();

        good.addGood("Яблоко", 25.6);
        good.addGood("Груша", 22.1);
        good.addGood("Банан", 40);
        good.addGood("Ананас", 95.7);
        good.addGood("Кокос", 250.78);

        Random r = new Random();

        for (int i = 0; i < 120; i++) {
            Runnable task = () -> {
                generateBuyersInThread(r.nextInt(2) + 1, good);
            };
            executor.execute(task);

            TimeUnit.SECONDS.sleep(1);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Ждем завершения всех задач
        }

    }

    private static void generateBuyersInThread(int count, Good good) {
        for (int i = 0; i < count; i++) {

            Buyer buyer = new Buyer(good);

            executor.execute(buyer);
        }
    }
}

