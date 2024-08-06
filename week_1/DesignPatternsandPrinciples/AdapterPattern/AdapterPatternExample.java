public class AdapterPatternExample {
    public static void main(String[] args) {
        // Create payment gateways
        PayPalGateway paypalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for payment gateways
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Process payments using adapters
        paypalAdapter.processPayment("john.doe@example.com", 100.0);
        stripeAdapter.processPayment("1234-5678-9012-3456", 50.0);
    }
}