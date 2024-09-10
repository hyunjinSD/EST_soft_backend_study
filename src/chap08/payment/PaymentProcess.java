package chap08.payment;

public class PaymentProcess {
    public static void main(String[] args) {
        // 객체 생성 (paypal, creditcard)

        // interface도 타입이 될 수 있다 (Payment) 다형성
        Payment creditCard = new CreditCard("1234-5677");
//        CreditCard creditCard = new CreditCard("1234-5677");
        creditCard.prosessPayment(67000);

        Payment paypal = new Paypal("email@naver.com");
//        Paypal paypal = new Paypal("email@naver.com");
        paypal.prosessPayment(63000);
    }
}
