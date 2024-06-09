package homework7.task1;

public class GoodDto {

    private String product;
    private Double price;

    public GoodDto() {
    }

    public GoodDto(String product, Double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "GoodDto{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
