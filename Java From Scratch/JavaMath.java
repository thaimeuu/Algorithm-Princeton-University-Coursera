// Lesson 6: Math

/* The Java Math class has many methods that allows you to perform mathematical tasks on numbers. */

public class JavaMath {
    public static void main(String[] args) {
        System.out.println("Lesson 6: Math");
        // Math.max() and Math.min()
        System.out.println(Math.max(0, 9));
        // Math.sqrt()
        System.out.println(Math.sqrt(25.0d));
        // Math.abs()
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}