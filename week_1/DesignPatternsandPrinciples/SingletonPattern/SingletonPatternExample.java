public class SingletonPatternExample {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (logger1 == logger2));

        // Log some messages
        logger1.log("Hello, World!");
        logger2.log("This is another log message.");
    }
}