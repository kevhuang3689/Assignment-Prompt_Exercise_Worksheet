package programming.training.week_1.week2.day3.Vehicle_Rental;

// Bike extends Vehicle, inheritance
public class Bike extends Vehicle {

    public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
        super(vehicleNumber, model, ratePerDay, days); // calls parent constructor
    }

    // Bike's own version of calculateRent() (10% discount), polymorphism
    @Override
    public double calculateRent() {
        return super.calculateRent() * 0.9;
    }

    // Bike's own version of displayDetails(), polymorphism 
    @Override
    public void displayDetails() {
        System.out.println("Bike | " + vehicleNumber + " | " + model+ " | Days: " + days + " | Rent: " + calculateRent());
    }
}