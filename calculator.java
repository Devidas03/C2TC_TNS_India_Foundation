import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an arithmetic operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            choice = inputScanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = inputScanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = inputScanner.nextDouble();
                double result;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Addition Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Subtraction Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Multiplication Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Division Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
            }

        } while (choice != 5);

        inputScanner.close();
    }
}
