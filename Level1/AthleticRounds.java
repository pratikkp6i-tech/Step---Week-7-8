import java.util.Scanner;

public class AthleticRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle (meters):");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double rounds = computeRounds(s1, s2, s3);
        System.out.println("To complete 5km, the athlete must complete " + rounds + " rounds.");
        sc.close();
    }

    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5km = 5000m
    }
}