package BuilderPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class BuilderTest {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .build();
        comp1.showSpecs();

        Computer comp2 = new Computer.Builder()
                .setCPU("Ryzen 5")
                .build();
        comp2.showSpecs();
    }
}