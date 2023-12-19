// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate the area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method shared by all shapes
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects using abstraction
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Calling methods without knowing the internal details
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
