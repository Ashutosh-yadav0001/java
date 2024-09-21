import java.util.Scanner;

public class basic_Calculators {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask the user to choose an operation
        System.out.println("Choose an operation: ");
        System.out.println("1 for Addition (+)");
        System.out.println("2 for Subtraction (-)");
        System.out.println("3 for Multiplication (*)");
        System.out.println("4 for Division (/)");
        int operation = scanner.nextInt();

        double result = 0; // Variable to store the result of the calculation

        // Perform the selected operation using if-else statements
        if (operation == 1) {
            result = num1 + num2; // Addition
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (operation == 2) {
            result = num1 - num2; // Subtraction
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (operation == 3) {
            result = num1 * num2; // Multiplication
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (operation == 4) {
            if (num2 == 0) {
                // Check for division by zero
                System.out.println("Error: Cannot divide by zero!");
            } else {
                result = num1 / num2; // Division
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            }
        } else {
            // Handle invalid operation input
            System.out.println("Invalid operation choice. Please select 1, 2, 3, or 4.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
