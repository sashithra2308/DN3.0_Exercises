public class PayPalGateway {
    public void makePayment(String email, double amount) {
        System.out.println("Processing PayPal payment for " + email + ": $" + amount);
    }
}
