package DecoratorPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new EmailNotifier());
        notifier.send("System Alert!");
    }
}