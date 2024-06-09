package homework7.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Buyer implements Runnable, IBuyer, IUseBasket {

    private Basket basket;

    private Good good;

    private GoodDto product;

    public Buyer(Good good) {
        this.good = good;
    }

    @Override
    public void run() {
        Random r = new Random();
        int countProduct = r.nextInt(4) + 1;

        try {
            enterToMarket();

            takeBasket();

            Thread.sleep(r.nextInt((2000 - 500) + 1) + 500);

            for (int i = 0; i < countProduct; i++) {
                chooseGoods();

                Thread.sleep(r.nextInt((2000 - 500) + 1) + 500);

                putGoodsToBasket();
            }

            goOut();

        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " Покупатель зашел в магазин");
    }

    @Override
    public void takeBasket() {
        System.out.println(this + " Берет корзину");

        basket = new Basket();
    }


    @Override
    public void chooseGoods() {

        String nameProduct = getRandomProductName();

        System.out.println(this + " Выбирает товар: " + nameProduct);

        product = good.getGoodProduct(nameProduct);
    }

    @Override
    public void putGoodsToBasket() {

        System.out.println(this + " Кладет товар в корзин: " + product.getProduct());

        basket.addProductBasket(product);
    }

    @Override
    public void goOut() {
        System.out.println(this + " Уходит из магазина.\n" +
                "Товары в корзине: "+ basket.getBasket());


    }

    private String getRandomProductName() {
        Random random = new Random();
        return good.getGoods().keySet().stream()
                .skip(random.nextInt(good.getGoods().keySet().size()))
                .findFirst()
                .get();
    }
}
