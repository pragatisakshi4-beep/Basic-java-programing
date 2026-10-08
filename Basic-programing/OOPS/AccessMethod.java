// Demonstration of Access Modifiers (Access Specifiers) for Methods in Java
class SampleDemo {

    // 1. PUBLIC METHOD - Can be accessed from anywhere
    public void publicMethod() {
        System.out.println("1. Public Method: Accessible from anywhere.");
    }

    // 2. PROTECTED METHOD - Accessible in same package & subclasses
    protected void protectedMethod() {
        System.out.println("2. Protected Method: Accessible in same package & subclasses.");
    }

    // 3. DEFAULT METHOD (No modifier) - Accessible within the same package
    void defaultMethod() {
        System.out.println("3. Default Method: Accessible within the same package.");
    }

    // 4. PRIVATE METHOD - Accessible ONLY inside this class (SampleDemo)
    private void privateMethod() {
        System.out.println("4. Private Method: Accessible ONLY inside SampleDemo class.");
    }

    // Public helper method to access the private method from outside
    public void callPrivateMethod() {
        System.out.println("Calling private method via public helper method:");
        privateMethod(); // Allowed because it's inside the same class
    }

    // 5. STATIC METHOD - Can be accessed directly using Class Name without creating object
    public static void staticMethod() {
        System.out.println("5. Static Method: Called using ClassName.methodName() without object.");
    }
}

// Main Class matching file name AccessMethod.java
public class AccessMethod {
    public static void main(String[] args) {
        System.out.println("=== ACCESS MODIFIERS & METHOD ACCESS DEMO ===");

        // Creating object of SampleDemo class
        SampleDemo obj = new SampleDemo();

        // Accessing Public Method
        obj.publicMethod();

        // Accessing Protected Method
        obj.protectedMethod();

        // Accessing Default Method
        obj.defaultMethod();

        // ❌ Direct access to Private Method is NOT allowed:
        // obj.privateMethod(); // ERROR: privateMethod() has private access in SampleDemo

        // ✅ Accessing Private Method using Public Helper/Wrapper
        obj.callPrivateMethod();

        System.out.println("-----------------------------------");

        // Accessing Static Method (No object needed)
        SampleDemo.staticMethod();
    }
}
