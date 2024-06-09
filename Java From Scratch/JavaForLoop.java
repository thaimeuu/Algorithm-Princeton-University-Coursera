// Lesson 10: For Loop

public class JavaForLoop {

    public static void main(String[] args) {
        System.out.println("Lesson 10: For Loop");
        // For Loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        // Nested Loop
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sum += (i + j);
            }
        }
        System.out.println("Sum: " + sum);
        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}