package behavioralPatterns.StrategyDP;


public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("cash payment");
    }
}
