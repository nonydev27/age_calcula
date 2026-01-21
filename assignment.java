import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        System.out.println("This program is to find the average of 10 figures, find the std deviation and then the factorial");
        
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;

        // --- Part 1: Input & Average ---
        System.out.println("\n--- Enter 10 numbers ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / 10;
        System.out.println("\n1. Average: " + average);

        // --- Part 2: Standard Deviation ---
        double sumSquaredDiffs = 0.0;
        for (int i = 0; i < 10; i++) {
            // (x - mean)^2
            sumSquaredDiffs += Math.pow(numbers[i] - average, 2);
        }
        
        // Formula: sqrt(sum of squared differences / N)
        double stdDev = Math.sqrt(sumSquaredDiffs / 10);
        System.out.printf("2. Standard Deviation: %.4f%n", stdDev);

        // --- Part 3: Factorial ---
        // Note: Factorials are usually for integers. We will ask for a specific number.
        System.out.print("\n--- Enter a positive integer to find its Factorial: ");
        int numForFactorial = scanner.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= numForFactorial; i++) {
            factorial *= i;
        }

        System.out.println("3. Factorial of " + numForFactorial + " is: " + factorial);
        
        scanner.close();
    }
}