// Lesson 12: Methods/Functions
public class JavaMethods {
    // Used for lesson 13, don't mind this
    String greet = "Hello this is JavaMethods class from lesson 12";
    
    // Non-parameter
    public static void sayHello() {
        System.out.println("Hello World");
    }

    // Parameter
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // Return
    public static int add_5(int x) {
        return x + 5;
    }

    // Recursion
    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
      }

    public static void main(String[] args) {
        System.out.println("Lesson 12: Methods");
        sayHello();
        greet("Thai");
        System.out.println("3 + 5 is " + add_5(3));
        System.out.println("Sum(0,1,..10) = " + sum(10));
    }
}
