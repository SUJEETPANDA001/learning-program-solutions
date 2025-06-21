/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Order {
    String orderId;
    String customerName;
    double totalPrice;
    
    public Order(String id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }
    
    @Override
    public String toString() {
        return String.format("Order %s: %s - $%.2f", orderId, customerName, totalPrice);
    }
}

public class OrderSorting {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (orders[j].totalPrice < orders[j+1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }
    
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi-1);
            quickSort(orders, pi+1, high);
        }
    }
    
    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice > pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        return i+1;
    }
    
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O1001", "Alice", 150.0),
            new Order("O1002", "Bob", 75.5),
            new Order("O1003", "Charlie", 250.0)
        };
        
        bubbleSort(orders.clone());
        System.out.println("Bubble Sorted (High to Low):");
        for (Order o : orders) System.out.println(o);
        
        Order[] orders2 = orders.clone();
        quickSort(orders2, 0, orders2.length-1);
        System.out.println("\nQuick Sorted (High to Low):");
        for (Order o : orders2) System.out.println(o);
    }
}