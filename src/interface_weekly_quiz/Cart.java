package interface_weekly_quiz;

import java.math.BigDecimal;

import static interface_weekly_quiz.Policy.*;

public class Cart {
    private Product[] products;
    private BigDecimal totalPrice;
    private int totalWeight;
    // 상품의 총 가격, 무게합

    public Cart(Product[] products) {
        this.products = products;

        this.totalPrice = BigDecimal.ZERO;
        for (Product product : products) {
            this.totalPrice = totalPrice.add(product.getPrice());
            this.totalWeight += product.getWeight();
        }
    }

    public int calculateDeliveryCharge() {
        // 1. 총 무게에 따라 배송비 책정
        int deliveryCharge = deliveryChargeForWeight(totalWeight);


        // 2. 상품의(할인 금액 적용된) 가격에 따라 추가 계산

        if (totalPrice.compareTo(PRICE_POLICY_LEVEL_1) < 0 ) {
            return deliveryCharge;
        } else if (totalPrice.compareTo(PRICE_POLICY_LEVEL_2) < 0) {
            return deliveryCharge - DELIVERY_DISCOUNT_AMOUNT;
        }
        return DELIVERY_CHAGE_FREE;
    }
}
