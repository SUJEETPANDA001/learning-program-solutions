/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class FinancialForecast {
    public static double recursiveForecast(double[] pastValues, int futurePeriod) {
        if (futurePeriod <= 0) return pastValues[pastValues.length - 1];
        double lastValue = recursiveForecast(pastValues, futurePeriod - 1);
        double growthRate = calculateAverageGrowthRate(pastValues);
        return lastValue * (1 + growthRate);
    }
    
    public static double iterativeForecast(double[] pastValues, int futurePeriod) {
        double growthRate = calculateAverageGrowthRate(pastValues);
        double current = pastValues[pastValues.length - 1];
        for (int i = 0; i < futurePeriod; i++) current *= (1 + growthRate);
        return current;
    }
    
    private static double calculateAverageGrowthRate(double[] values) {
        double totalGrowth = 0;
        for (int i = 1; i < values.length; i++) {
            totalGrowth += (values[i] - values[i-1]) / values[i-1];
        }
        return totalGrowth / (values.length - 1);
    }
    
    public static void main(String[] args) {
        double[] pastValues = {100.0, 105.0, 110.25, 115.76};
        System.out.printf("Recursive forecast (1 period): $%.2f%n", recursiveForecast(pastValues, 1));
        System.out.printf("Iterative forecast (5 periods): $%.2f%n", iterativeForecast(pastValues, 5));
    }
}