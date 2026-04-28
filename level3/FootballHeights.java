package level3;

import java.util.Scanner;

public class FootballHeights {
    public static void main(String[] args) {
        // b. Create an int array of size 11
        int[] heights = new int[11];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height (150-250 cms) for 11 players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        // g. Display results by calling methods
        System.out.println("\n--- Results ---");
        System.out.println("Mean Height: " + findMean(heights) + " cms");
        System.out.println("Shortest Height: " + findShortest(heights) + " cms");
        System.out.println("Tallest Height: " + findTallest(heights) + " cms");
        sc.close();
    }

    // c. Method to find the sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    // d. Method to find the mean
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // e. Method to find shortest
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    // f. Method to find tallest
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }
}