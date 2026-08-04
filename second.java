
package inherit;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // 2. Get the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // 3. Get the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // 4. Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error! Invalid operator.");
                break;
        }

        scanner.close();
    }
}
