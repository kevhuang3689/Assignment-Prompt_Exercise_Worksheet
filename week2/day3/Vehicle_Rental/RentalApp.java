package programming.training.week_1.week2.day3.Vehicle_Rental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int numberOfVehicles = scanner.nextInt();

        // One list holds both Cars and Bikes using parent type
        List<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < numberOfVehicles; i++) {
            // Keep asking until a valid type 
            int type;
            while (true) {
                System.out.print("Enter type (1-Car, 2-Bike): ");
                type = scanner.nextInt();
                if (type == 1 || type == 2) {
                    break;
                }
                System.out.println("Invalid vehicle type. Please try again.");
            }

            System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = scanner.next();

            System.out.print("Enter Model: ");
            String model = scanner.next();

            System.out.print("Enter Rate per Day: ");
            double ratePerDay = scanner.nextDouble();

            System.out.print("Enter Days: ");
            int days = scanner.nextInt();

            // parent type reference holding a subclass object, polymorphism
            Vehicle v;
            if (type == 1) {
                System.out.print("Enter Insurance per Day: ");
                double insurancePerDay = scanner.nextDouble();
                v = new Car(vehicleNumber, model, ratePerDay, days, insurancePerDay);
            } else {
                v = new Bike(vehicleNumber, model, ratePerDay, days);
            }
            vehicles.add(v);
        }

        System.out.println("--- Rental Details ---");
        double totalRent = 0;
        for (Vehicle v : vehicles) {
            v.displayDetails();             // Car or Bike version runs, polymorphism
            totalRent += v.calculateRent(); // polymorphism
        }
        System.out.println("Total Rent Collected: " + totalRent);

        scanner.close();
    }
}