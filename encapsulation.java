public class Person {
    // Private fields encapsulated within the class
    private String name;
    private int age;

    // Public methods to access and modify the encapsulated data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Perform validation or other logic if needed
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Perform validation or other logic if needed
        this.age = age;
    }

    // Other methods can be added for behavior

    // Example constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
