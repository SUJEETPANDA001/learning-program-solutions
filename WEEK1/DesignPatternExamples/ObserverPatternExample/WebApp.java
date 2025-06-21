package ObserverPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class WebApp implements Observer {
    public void update(float price) {
        System.out.println("Web App - Stock price updated to: " + price);
    }
}