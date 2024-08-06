public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if no more years left, return present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: calculate the future value for the next year
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial value
        double annualGrowthRate = 0.05;    // 5% growth rate
        int years = 10;                    // Number of years for prediction

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
