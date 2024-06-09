package homework7.task1;

import java.util.HashMap;
import java.util.Map;

public class Good {

    private final Map<String, Double> goods = new HashMap<>();

    public void addGood(String product, double price) {
        if (product.trim().isEmpty()) {
            throw new IllegalArgumentException("Вы не ввели название продукта!");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Вы ввели цену продукта меньше нуля!");
        }
        goods.put(product, price);
    }

    public GoodDto getGoodProduct(String product) {
        Double rezultPrice = goods.get(product);
        if (rezultPrice == null) {
            throw new IllegalArgumentException("Данного продукта не существует!");
        }
        return new GoodDto(product, rezultPrice);
    }

    public Map<String, Double> getGoods() {
        return new HashMap<>(goods);
    }

}
