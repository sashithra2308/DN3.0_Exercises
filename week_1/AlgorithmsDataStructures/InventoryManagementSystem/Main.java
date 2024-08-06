

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("Initial Inventory:");
        inventory.displayProducts();

        // Updating a product
        product1.setQuantity(12);
        inventory.updateProduct(product1);

        System.out.println("\nInventory after updating Laptop quantity:");
        inventory.displayProducts();

        // Deleting a product
        inventory.deleteProduct("P002");

        System.out.println("\nInventory after deleting Smartphone:");
        inventory.displayProducts();

        // Getting a single product
        Product retrievedProduct = inventory.getProduct("P003");
        System.out.println("\nRetrieved Product: " + retrievedProduct);
    }
}
