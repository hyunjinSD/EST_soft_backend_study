package interface_weekly_quiz;

import java.math.BigDecimal;

public class DeliveryChargeCalculator {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", BigDecimal.valueOf(30000), 2);
        Product grocery = new Grocery("grocery", BigDecimal.valueOf(20000), 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50000), 5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }
}
