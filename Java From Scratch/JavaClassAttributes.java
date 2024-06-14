// Lesson 14: Class Attributes

public class JavaClassAttributes {
    int clsAttribute = 3;
    final int clsAttribute1 = 5;  // cannot change this value
    public static void main(String[] args) {
        System.out.println("Lesson 14: Class Attributes");
        // Create an object
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println("Class attribute: " + myObj.clsAttribute);
        // Change attribute
        myObj.clsAttribute = 5;
        System.out.println("Class attribute: " + myObj.clsAttribute);
        // Try changing value attached with final keyword
        // myObj.clsAttribute1 = 7;
    }
}
