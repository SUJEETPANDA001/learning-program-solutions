package ObserverPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}