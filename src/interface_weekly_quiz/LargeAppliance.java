package interface_weekly_quiz;

import java.math.BigDecimal;

public class LargeAppliance extends Product{
    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
