package interface_weekly_quiz;

import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price.subtract(getDiscountAmount());
    }

    public double getWeight() {
        return weight;
    }
}
