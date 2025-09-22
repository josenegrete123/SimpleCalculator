import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] args) {

        double firstNumber = 0;
        double secondNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input the first number: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            } else {
                firstNumber = scanner.nextDouble();
                break;
            }
        }

        while (true) {
            System.out.print("Input the second number: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            } else {
                secondNumber = scanner.nextDouble();
                break;
            }
        }

        double sumOfNumbers = firstNumber + secondNumber;
        double diffOfNumbers = firstNumber - secondNumber;
        double productOfNumbers = firstNumber * secondNumber;
        double quotientOfNumbers = firstNumber / secondNumber;

        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Difference: " + diffOfNumbers);
        System.out.println("Product: " + productOfNumbers);
        System.out.println("Quotient: " + quotientOfNumbers);
    }
}