// Base class (parent class) representing a vehicle

class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class (child class) representing a car, inheriting from Vehicle
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year); // Call the constructor of the base class
        this.numDoors = numDoors;
    }

    // Additional method specific to Car
    public void honk() {
        System.out.println("Honk! Honk!");
    }

    // Override displayInfo to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the base class
        System.out.println("Number of Doors: " + numDoors);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating objects using inheritance
        Vehicle vehicle = new Vehicle("Generic Brand", 2022);
        Car car = new Car("Toyota", 2023, 4);

        // Calling methods
        System.out.println("Vehicle Information:");
        vehicle.displayInfo();
        vehicle.start();
        vehicle.stop();
        System.out.println();

        System.out.println("Car Information:");
        car.displayInfo();
        car.start();
        car.stop();
        car.honk();
    }
}
