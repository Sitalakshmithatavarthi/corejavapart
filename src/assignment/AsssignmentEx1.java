package assignment;

import java.util.Scanner;
   public class AsssignmentEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u = 36; // Initial velocity in km/hr
        double a = 5;  // Acceleration in m/s^2
        double distance, t;

        while(scanner.hasNext()) {
            t = scanner.nextDouble(); // Input time interval in seconds
            distance = (u * 1000 / 3600) * t + (a * t * t) / 2; // Calculating distance
            System.out.println("Distance travelled: " + distance + " meters");
        }
        scanner.close();
    }
}

