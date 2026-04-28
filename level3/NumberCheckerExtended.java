package level3;
import java.util.Scanner;

public class NumberCheckerExtended {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] digits = NumberChecker.storeDigits(num);

        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshad(num, digits));
        displayDigitFrequency(digits);
        sc.close();
    }

    // b. Sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // d. Harshad number check (divisible by sum of its digits)
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    // e. Digit Frequency using a 2D Array
    public static void displayDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; // Column 1: Digit

        for (int d : digits) {
            freq[d][1]++; // Column 2: Frequency
        }

        System.out.println("\nDigit Frequency (2D Array):");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " | Frequency: " + freq[i][1]);
            }
        }
    }
}