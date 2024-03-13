import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number between 1 and 20: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 20) {
            // Initialize arrays to store odd and even numbers
            int[] oddNumbers = new int[(n + 1) / 2];
            int[] evenNumbers = new int[n / 2];

            // Populate odd and even arrays
            int oddIndex = 0;
            int evenIndex = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    oddNumbers[oddIndex] = i;
                    oddIndex++;
                } else {
                    evenNumbers[evenIndex] = i;
                    evenIndex++;
                }
            }

            // Calculate sum of odd and even numbers
            int sumOdd = 0;
            int sumEven = 0;
            for (int odd : oddNumbers) {
                sumOdd += odd;
            }
            for (int even : evenNumbers) {
                sumEven += even;
            }

            // Display results
            System.out.print("Odd Numbers: ");
            for (int odd : oddNumbers) {
                System.out.print(odd + " ");
            }
            System.out.println("\nSum of Odd Numbers: " + sumOdd);

            System.out.print("Even Numbers: ");
            for (int even : evenNumbers) {
                System.out.print(even + " ");
            }
            System.out.println("\nSum of Even Numbers: " + sumEven);
        } else {
            System.out.println("Please enter a number between 1 and 20.");
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}