public class PowerCalculator {
    public static double calculatePower(double base, int exponent) {
        // Check if the exponent is positive.
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a non-negative number");
        }
        // Calculate the power.
        double result = Math.pow(base, exponent);
        return result;
    }

    public static void main(String[] args) {
        // Example usage0
        double result = calculatePower(2, 3); // Calculate 2 to the power of 3
        System.out.println(result); // Display the result
    }
}
