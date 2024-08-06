public class ProxyPatternExample {
    public static void main(String[] args) {
        // Create proxy images
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display images using proxy
        image1.display();
        image2.display();
        image1.display();
    }
}