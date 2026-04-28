package Level2;

import java.util.Scanner;

public class RecursiveSumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Calculate using recursion
            int recursiveResult = findSumRecursive(n);
            
            // Calculate using formula
            int formulaResult = findSumFormula(n);

            System.out.println("Sum using Recursion: " + recursiveResult);
            System.out.println("Sum using Formula: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and match!");
            }
        }
        sc.close();
    }

    // Method to find sum using recursion
    public static int findSumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + findSumRecursive(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}