package Level2;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Calling the method to calculate interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // d. Output exactly as requested in the hint
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
        
        sc.close();
    }

    // c. Method to calculate simple interest given parameters
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}