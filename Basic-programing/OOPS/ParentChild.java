// Parent Class
class Parent {
    // Original method
    void display1() {
        System.out.println("Inside Parent display1 (No arguments)");
    }

    // Method Overloading in Parent class (Same method name, different parameter)
    void display1(String message) {
        System.out.println("Inside Parent display1 (Overloaded with String): " + message);
    }

    void display2() {
        System.out.println("Inside Parent display2");
    }
}

// Child Class extending Parent
class Child1 extends Parent {
    // 1. METHOD OVERRIDING (Same method name and parameters as Parent class)
    @Override
    void display1() {
        System.out.println("Inside Child1 display1 (Overridden version)");
    }

    // 2. METHOD OVERLOADING in Child Class (Same name, different parameter type)
    void display1(int number) {
        System.out.println("Inside Child1 display1 (Overloaded with int): " + number);
    }

    void display3() {
        System.out.println("Inside Child1 display3");
    }
}

// Main Class (File Name must match ParentChild.java)
public class ParentChild {
    public static void main(String[] args) {
        System.out.println("=== 1. METHOD OVERRIDING DEMO (Runtime Polymorphism) ===");
        Parent p = new Child1(); // Upcasting
        p.display1(); // Child1 ka overridden display1() run hoga

        System.out.println("\n=== 2. METHOD OVERLOADING DEMO (Compile-time Polymorphism) ===");
        Child1 c = new Child1();
        c.display1();             // No arg version (Overridden in Child1)
        c.display1("Hello Java"); // String arg version (Inherited Overloaded from Parent)
        c.display1(100);          // Int arg version (Overloaded in Child1)

        System.out.println("\n=== 3. OTHER METHODS ===");
        c.display2(); // Parent class method
        c.display3(); // Child1 class method
    }
}
