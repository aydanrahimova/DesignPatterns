package behavioralPatterns.StrategyDP;


public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("card payment");
    }
}
