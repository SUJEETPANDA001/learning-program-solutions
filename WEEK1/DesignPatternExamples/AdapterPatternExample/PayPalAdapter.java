package AdapterPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway = new PayPalGateway();

    public void processPayment(double amount) {
        gateway.sendPayment(amount);
    }
}