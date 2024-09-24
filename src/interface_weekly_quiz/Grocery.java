package interface_weekly_quiz;

import java.math.BigDecimal;

public class Grocery extends Product {
    public Grocery(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(2000);
    }
}
