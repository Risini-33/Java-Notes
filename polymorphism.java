// Base class representing a shape
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class representing a circle, overriding the draw method
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class representing a square, also overriding the draw method
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample {
    // Compile-time polymorphism (method overloading)
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Compile-time polymorphism
        int sumInt = add(5, 10);
        double sumDouble = add(3.5, 7.2);

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
        System.out.println();

        // Runtime polymorphism
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Calls draw method of Circle
        shape2.draw(); // Calls draw method of Square
    }
}
