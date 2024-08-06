package SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        // Create an array of orders
        Order[] orders = {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 350.00),
            new Order("O004", "David", 100.00),
            new Order("O005", "Eve", 300.00)
        };

        // Bubble Sort
        System.out.println("Orders before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset the array for Quick Sort
        orders = new Order[]{
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 350.00),
            new Order("O004", "David", 100.00),
            new Order("O005", "Eve", 300.00)
        };

        // Quick Sort
        System.out.println("\nOrders before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

