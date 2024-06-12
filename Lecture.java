// Define a class named 'Car'
public class Car {
    // Attributes of the Car class
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: " + year + " " + make + " " + model);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Access the object's method to display details
        myCar.displayDetails();
    }
}
