package ProxyPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo1.jpg");
        image.display();
        image.display(); 
    }
}