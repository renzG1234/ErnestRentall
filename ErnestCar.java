/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ErnestCar extends Vehicle {
    private int numberOfDoors;

    // Constructor calls superclass constructor and initializes numberOfDoors
    public ErnestCar make, String model, double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }

    // Override displayDetails to include numberOfDoors info
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Implement abstract method performMaintenance from Vehicle class
    @Override
    public void performMaintenance() {
        System.out.println("Performing general car maintenance.");
    }
}