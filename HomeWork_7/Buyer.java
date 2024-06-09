import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Buyer implements IBuyer, IUseBasket, Runnable {

    private String name;
    private Basket basket;
    private HashMap<String, Double> availableGoods;
    private Random random;

    Buyer(String name, HashMap<String, Double> availableGoods) {
        this.name = name;
        this.basket = new Basket();
        this.availableGoods = availableGoods;
        this.random = new Random();
    }

    @Override
    public void enterToMarket() {
        System.out.println(name + " вошел в магазин.");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Начал выбирать товар.");
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(2) + 1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void goOut() {
        System.out.println(name + " отправился на выход");
    }

    @Override
    public void takeBasket() {
        System.out.println(name + " взял корзину");
    }

    @Override
    public void putGoodsToBasket() {
        int numGoods = random.nextInt(4) + 1;
        List<String> goods = new ArrayList<>(availableGoods.keySet());

        for (int i = 0; i < numGoods; i++) {
            String selectedGood = goods.get(random.nextInt(goods.size()));
            basket.addGoods(selectedGood);
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(2) + 1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(name + " закончил выбирать товары");
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }
}
