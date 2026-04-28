package Level2;

import java.util.Scanner;

public class UnitConvertor {
    // Static conversion methods
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double m) { return m * 3.28084; }
    public static double convertFeetToMeters(double ft) { return ft * 0.3048; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to convert: ");
        double val = sc.nextDouble();

        System.out.println(val + " km to miles: " + convertKmToMiles(val));
        System.out.println(val + " meters to feet: " + convertMetersToFeet(val));
        
        sc.close();
    }
}