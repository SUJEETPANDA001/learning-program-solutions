package ObserverPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class MobileApp implements Observer {
    public void update(float price) {
        System.out.println("Mobile App - Stock price updated to: " + price);
    }
}