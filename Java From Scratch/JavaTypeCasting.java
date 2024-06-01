// Lesson 3: Type Casting

// ===================================TYPE CASTING===========================================

/* Java Type Casting
- Type casting is when you assign a value of one primitive data type to another type.
- In Java, there are two types of casting:
    - Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double
    - Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte */

public class JavaTypeCasting {
    public static void main(String[] args) {
        System.out.println("Lesson 3: Type Casting");
        // Widening
        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic casting: int to double
        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0
        // Narrowing casting must be done manually by placing the type in parentheses () in front of the value
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
        // Example: it's widening (int to float ==>> automatic) but also requires () or it won't work
        float percentage = (float) 3 / 4 * 100.0f;
        System.out.println(percentage + "%");
    }
}
