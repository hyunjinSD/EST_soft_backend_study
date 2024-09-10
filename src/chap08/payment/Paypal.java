package chap08.payment;

public class Paypal implements Payment{

    private String email;

    public Paypal(String email) {
        this.email = email;
    }
    @Override
    public void prosessPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card number: " + email);
    }
}
