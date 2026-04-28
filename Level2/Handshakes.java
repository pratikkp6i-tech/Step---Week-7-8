package Level2;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a. Get integer input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        // c. Use the method to calculate
        int totalHandshakes = calculateHandshakes(numberOfStudents);
        
        // d. Display the result
        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);
        
        sc.close();
    }

    // b & c. Method using combination formula (n * (n - 1)) / 2
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}