import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        displaySmallestAndLargest(n1, n2, n3);
        sc.close();
    }

    public static void displaySmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}