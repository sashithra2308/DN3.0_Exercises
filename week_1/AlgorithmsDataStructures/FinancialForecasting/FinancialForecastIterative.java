public class FinancialForecastIterative {

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + growthRate);
        }
        return presentValue;
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial value
        double annualGrowthRate = 0.05;    // 5% growth rate
        int years = 10;                    // Number of years for prediction

        double futureValue = calculateFutureValueIterative(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
