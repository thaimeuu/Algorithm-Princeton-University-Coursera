// Lesson 11: Arrays

public class JavaArrays {
    public static void main(String[] args) {
        System.out.println("Lesson 11: Arrays");
        // To declare an array, define the variable type with square brackets
        String[] field = {"ML", "CV", "NLP"};
        int[] point = {6, 8, 5};
        // Access the element of an array
        System.out.println("I give " + field[1] + " " + point[1] + " points");
        // Change value
        point[1] = 9;
        System.out.println("I give " + field[1] + " " + point[1] + " points");
        // Loop through array
        for (String i : field) {
            System.out.println("I like " + i);
        }
        // Another way
        for (int i = 0; i < field.length; i++) {
            System.out.println("I like " + field[i]);
        }
        // Multidimensional Arrays
        // To create a two-dimensional array, add each array within its own set of curly braces
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
    }
}
