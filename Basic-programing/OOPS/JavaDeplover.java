// Parent Class
class Developer {
    void work() {
        System.out.println("Developer is working...");
    }

    void project() {
        System.out.println("Developer is doing a project...");
    }
}

// Child Class 1: JavaDeveloper
class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Java Developer is working on Java code.");
    }

    @Override
    void project() {
        System.out.println("Java Developer is building a Spring Boot project.");
    }

    // Child-specific method
    void codeInJava() {
        System.out.println("Writing Spring Boot application.");
    }
}

// Child Class 2: PythonDeveloper
class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Python Developer is working on Python code.");
    }

    @Override
    void project() {
        System.out.println("Python Developer is building an AI/ML project.");
    }
}

// Main Class
public class JavaDeplover {
    public static void main(String[] args) {
        System.out.println("=== UPCASTING DEMO ===");

        // Upcasting 1: JavaDeveloper -> Developer reference
        Developer dev1 = new JavaDeveloper();
        dev1.work();    // Output: Java Developer is working on Java code.
        dev1.project(); // Output: Java Developer is building a Spring Boot project.

        System.out.println("-----------------------------------");

        // Upcasting 2: PythonDeveloper -> Developer reference
        Developer dev2 = new PythonDeveloper();
        dev2.work();    // Output: Python Developer is working on Python code.
        dev2.project(); // Output: Python Developer is building an AI/ML project.

        System.out.println("-----------------------------------");

        // Calling child-specific method using Downcasting:
        if (dev1 instanceof JavaDeveloper) {
            JavaDeveloper javaDev = (JavaDeveloper) dev1;
            javaDev.codeInJava();
        }
    }
}
