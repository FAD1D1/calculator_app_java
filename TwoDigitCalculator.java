import java.util.Scanner;

public class TwoDigitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two digits
        System.out.print("Enter the first digit: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int num2 = scanner.nextInt();

        // Perform operations and display results
        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Difference: " + difference(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.println("Quotient: " + quotient(num1, num2));

        scanner.close();
    }

    // Method to calculate the sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the difference
    public static int difference(int a, int b) {
        return a - b;
    }

    // Method to calculate the product
    public static int product(int a, int b) {
        return a * b;
    }

    // Method to calculate the quotient
    public static double quotient(int a, int b) {
        return (double) a / b;
    }
}
