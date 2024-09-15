import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        // Display the results
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);

        // Close the Scanner object
        scanner.close();
    }
}