package level3;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(num, digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
        sc.close();
    }

    // a. Count digits
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    // b. Store digits in array
    public static int[] storeDigits(int n) {
        int size = countDigits(n);
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }

    // c. Duck Number check (has a non-zero digit present)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    // d. Armstrong Number check
    public static boolean isArmstrong(int original, int[] digits) {
        double sum = 0;
        int power = digits.length;
        for (int d : digits) sum += Math.pow(d, power);
        return (int) sum == original;
    }

    // e. Largest and Second Largest using Integer.MIN_VALUE
    public static void findLargestAndSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    // f. Smallest and Second Smallest using Integer.MAX_VALUE
    public static void findSmallestAndSecondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < first) {
                second = first;
                first = n;
            } else if (n < second && n != first) {
                second = n;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }
}