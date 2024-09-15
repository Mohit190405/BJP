public class SumCalculator {
    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Declare and initialize two integers
        int num1 = 10;
        int num2 = 20;

        // Call the sum method and store the result
        int result = sum(num1, num2);

        // Print the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}