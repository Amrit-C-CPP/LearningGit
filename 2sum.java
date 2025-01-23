import java.util.Scanner;

public class ThreeNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Display the result
        System.out.println("The sum of the three numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
