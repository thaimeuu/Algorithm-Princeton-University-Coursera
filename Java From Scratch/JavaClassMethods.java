// Lesson 15: Class methods

public class JavaClassMethods {
    // Static method -> can use without creating an object
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method -. have to create an object first to call
    public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        System.out.println("Lesson 15: Class methods");
        myStaticMethod();
        JavaClassMethods myObj = new JavaClassMethods();
        myObj.myPublicMethod();
    }
}
