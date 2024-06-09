import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SupermarketSimulation {

    public static void main(String[] args) {

        HashMap<String, Double> availableGoods = new HashMap<>();
        availableGoods.put("Молоко", 2.5);
        availableGoods.put("Хлеб", 1.0);
        availableGoods.put("Яйца", 3.0);
        availableGoods.put("Сахар", 2.0);

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {
            Buyer buyer = new Buyer("Покупатель " + i, availableGoods);
            executor.execute(buyer);
            try {
                TimeUnit.SECONDS.sleep(new Random().nextInt(2));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}