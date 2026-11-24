package programming.training.week_1.week2.day3.Vehicle_Rental;

public class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double ratePerDay;
    protected int days;

    public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

    // Overridden by Car and Bike, runtime polymorphism
    public double calculateRent() {
        return ratePerDay * days;
    }

    // Overridden by Car and Bike, runtime polymorphism)
    public void displayDetails() {
        System.out.println("Vehicle | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
    }
}