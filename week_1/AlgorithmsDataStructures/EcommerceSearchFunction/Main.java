package EcommerceSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Table", "Furniture"),
            new Product("P004", "Chair", "Furniture"),
            new Product("P005", "Book", "Stationery")
        };

        // Linear search
        String searchProductName = "Chair";
        Product foundProduct = SearchAlgorithms.linearSearch(products, searchProductName);
        if (foundProduct != null) {
            System.out.println("Linear Search: Product found - " + foundProduct);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Sort the products array by productName for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        // Binary search
        foundProduct = SearchAlgorithms.binarySearch(products, searchProductName);
        if (foundProduct != null) {
            System.out.println("Binary Search: Product found - " + foundProduct);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}

