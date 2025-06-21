package StrategyPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(250.0);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(300.0);
    }
}