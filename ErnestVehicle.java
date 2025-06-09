/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ernestvehicle;

/**
 *
 * @author User
 */
public abstract class ErnestVehicle {
    protected String make;
    protected String model;
    protected double rentalPrice;

    public ErnestVehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice + " per day");
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double total = calculateRentalCost(days);
        return total - (total * (discountPercentage / 100));
    }

    // Abstract method to be implemented in subclasses
    public abstract void performMaintenance();
}
