package interface_weekly_quiz;

import java.math.BigDecimal;

public class Beauty extends Product{
    public Beauty(String name, BigDecimal price, double weight) {
        super(name,price, weight);
    }

    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(10000);
    }
}
