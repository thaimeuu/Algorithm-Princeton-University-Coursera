// Lesson 13: Classes/Objects

public class JavaClassesObjects {
    String greet = "Hello this is JavaClassesObjects class";

    public static void main(String[] args) {
        System.out.println("Lesson 13: Classes/Objects");
        // Create an object: cls_name obj_name = new cls_name();
        JavaClassesObjects myObj1 = new JavaClassesObjects();
        System.out.println(myObj1.greet);
        JavaClassesObjects myObj2 = new JavaClassesObjects();
        System.out.println(myObj2.greet);
        // Create an object of lesson 12 class
        JavaMethods myMethod = new JavaMethods();
        System.out.println(myMethod.greet);
    }
}
