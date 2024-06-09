package homework7.task1;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<GoodDto> basket = new ArrayList<>();

    public void addProductBasket(GoodDto goodDto) {
        basket.add(goodDto);
    }

    public List<GoodDto> getBasket() {
        return new ArrayList<>(basket);
    }


}
