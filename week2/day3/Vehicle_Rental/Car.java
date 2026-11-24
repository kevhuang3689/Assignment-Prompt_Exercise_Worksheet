package programming.training.week_1.week2.day3.Vehicle_Rental;

// Car extends Vehicle, inheritance
public class Car extends Vehicle {
    private double insurancePerDay;

    public Car(String vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
        super(vehicleNumber, model, ratePerDay, days); // calls parent constructor
        this.insurancePerDay = insurancePerDay;
    }

    // Car's own version of calculateRent(), polymorphism
    @Override
    public double calculateRent() {
        return super.calculateRent() + (insurancePerDay * days);
    }

    // Car's own version of displayDetails(), polymorphism
    @Override
    public void displayDetails() {
        System.out.println("Car | " + vehicleNumber + " | "+ model + " | Days: " + days + " | Rent: " + calculateRent());
    }
}