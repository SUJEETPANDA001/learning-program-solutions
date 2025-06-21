import java.util.Arrays;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Book {
    String bookId;
    String title;
    String author;
    
    public Book(String id, String title, String author) {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }
}

public class LibrarySystem {
    public static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equals(title)) return b;
        }
        return null;
    }
    
    public static Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].title.compareTo(title);
            if (comparison == 0) return books[mid];
            if (comparison < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    
    public static void main(String[] args) {
        Book[] books = {
            new Book("B1001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B1002", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B1003", "1984", "George Orwell")
        };
        
        Book foundLinear = linearSearch(books, "1984");
        System.out.println("Linear Search: " + (foundLinear != null ? foundLinear.bookId : "Not found"));
        
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title));
        Book foundBinary = binarySearch(books, "The Great Gatsby");
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary.bookId : "Not found"));
    }
}