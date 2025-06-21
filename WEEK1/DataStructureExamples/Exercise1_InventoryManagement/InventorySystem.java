import java.util.HashMap;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Qty: %d, Price: $%.2f", 
                productId, productName, quantity, price);
    }
}

public class InventorySystem {
    private HashMap<String, Product> inventory = new HashMap<>();
    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }
    
    public void updateProduct(String id, int newQty, double newPrice) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(newQty);
            product.setPrice(newPrice);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found!");
        }
    }
    
    public void deleteProduct(String id) {
        Product removed = inventory.remove(id);
        if (removed != null) {
            System.out.println("Product deleted: " + removed);
        } else {
            System.out.println("Product not found!");
        }
    }
    
    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();
        system.addProduct(new Product("P1001", "Laptop", 50, 999.99));
        system.addProduct(new Product("P1002", "Smartphone", 100, 699.99));
        system.updateProduct("P1001", 45, 899.99);
        system.deleteProduct("P1002");
    }
}