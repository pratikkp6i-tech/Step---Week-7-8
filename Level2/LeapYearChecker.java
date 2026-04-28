package Level2;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a year.");
            return;
        }
        
        int year = sc.nextInt();

        // a. Only works for year >= 1582
        if (year < 1582) {
            System.out.println("The program only works for years from 1582 onwards.");
        } else {
            // c. Call the method
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        sc.close();
    }

    // b & c. Method to check for Leap Year
    public static boolean isLeapYear(int y) {
        // Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}