// Lesson 9: While Loop

public class JavaWhileLoop {
    public static void main(String[] args) {
        System.out.println("Lesson 9: While Loop");
        int i = 1;
        // While loop
        while (i < 3) {
            System.out.println(i);
            i++;
        }
        // Do - While loop
        /* The do/while loop is a variant of the while loop. 
        This loop will execute the code block once, before checking if the condition is true, 
        then it will repeat the loop as long as the condition is true */
        int j = 1;
        do {
            System.out.println("Hello");
            j++;
        }
        while (j < 1);
    }
}
