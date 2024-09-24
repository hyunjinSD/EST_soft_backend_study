package interface_weekly_quiz;

import java.math.BigDecimal;

public class Policy {
    static final BigDecimal PRICE_POLICY_LEVEL_1 = BigDecimal.valueOf(30000);
    static final BigDecimal PRICE_POLICY_LEVEL_2 = BigDecimal.valueOf(100000);
    static final int DELIVERY_DISCOUNT_AMOUNT = 1000;
    static final int DELIVERY_CHAGE_FREE = 0;

    public static int deliveryChargeForWeight(int weight) {
        if (weight < 3) {
            return 1000;
        } else if (weight < 10) {
            return 5000;
        }
        return 10000;
    }
}
