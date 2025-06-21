package StrategyPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}