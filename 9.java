package javaprograms;

import java.util.Scanner;

// Main class
public class DivisionExample {

    // Custom exception class (User-defined)
    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    // Method to perform division
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            /*
             OOPS with JAVA: BCSL306A
             Academic Year: 2025-26
             Dept. of CSE, JITD
            */

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Attempt division
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());

        } finally {
            System.out.println("Program finished. Closing resources.");
            scanner.close();
        }
    }
}
