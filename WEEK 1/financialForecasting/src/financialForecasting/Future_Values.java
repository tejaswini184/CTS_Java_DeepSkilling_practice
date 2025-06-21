package financialForecasting;

public class Future_Values {
    public static double futureValue(double presentValue, double rate, int periods) {
        if (periods == 0) {
            return presentValue;  
        }
        return futureValue(presentValue, rate, periods - 1) * (1 + rate);
    }
    public static double futureValueIterative(double presentValue, double rate, int periods) {
        double result = presentValue;
        for (int i = 0; i < periods; i++) {
            result *= (1 + rate);
        }
        return result;
    }


    public static void main(String[] args) {
        double presentValue = 1000.0;  
        double rate = 0.05;            
        int periods = 7;               

        double result = futureValue(presentValue, rate, periods);
        double optimized_result=futureValueIterative(presentValue,rate,periods);
        System.out.printf("Future value after %d periods (Iterative): %.4f%n", periods, optimized_result);
        System.out.printf("Future value after %d periods (Recursive): %.4f%n", periods, result);

    }
}
