package AdapterPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment(150.00);
    }
}