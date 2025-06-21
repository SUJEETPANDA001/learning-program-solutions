import java.util.Arrays;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Product {
    String productId;
    String productName;
    String category;
    
    public Product(String id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class ProductSearch {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equals(name)) return p;
        }
        return null;
    }
    
    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareTo(name);
            if (comparison == 0) return products[mid];
            if (comparison < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    
    public static void main(String[] args) {
        Product[] products = {
            new Product("P1001", "Laptop", "Electronics"),
            new Product("P1002", "Smartphone", "Electronics"),
            new Product("P1003", "Desk Chair", "Furniture")
        };
        
        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));
        
        Product linearResult = linearSearch(products, "Smartphone");
        System.out.println("Linear Search: " + (linearResult != null ? linearResult.productId : "Not found"));
        
        Product binaryResult = binarySearch(products, "Laptop");
        System.out.println("Binary Search: " + (binaryResult != null ? binaryResult.productId : "Not found"));
    }
}