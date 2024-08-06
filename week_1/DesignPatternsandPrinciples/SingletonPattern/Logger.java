public class Logger {
    // Private static instance of itself
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Public static method to get the instance of Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Logged: " + message);
    }
}