// Lesson 5: Strings

// ==============================STRINGS======================================

/* Java Strings
- Strings are used for storing text.
- A String variable contains a collection of characters surrounded by double quotes */

/* String Method:
 * .length()
 * .toUpperCase()
 * .toLowerCase()
 * .indexOf()
 */

//  ==================================STRING CONCATENATION=======================

/* The + operator can be used between strings to combine them. This is called concatenation 
 * or we can use .concat() method
*/

public class JavaStrings {
    public static void main(String[] args) {
        System.out.println("Lesson 5: Strings");
        String name = "Nguyen Lam Thai";
        System.out.println("My name is: " + name);
        // .length() method
        System.out.println("My name has " + name.length() + " characters.");
        // .toUpperCase() method
        System.out.println("My name in uppercase format: " + name.toUpperCase());
        // .indexOf() method
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        // concatenation
        String field = "AI ", subfield = "Computer Vision";
        String program = field + subfield;
        System.out.println("I am interested in " + program);
        System.out.println("I am interested in " + field.concat(subfield));
        // add number and string using '+' ==>> a String
        String course = "AI/ML";
        int year = 2024;
        System.out.println("Course: " + course + year);
    }
}

// ===================================ESCAPE CHARACTER=================================

/* Other common escape sequences that are valid in Java are:

Code	Result	
-----------------------------------
\n	    New Line	
\r	    Carriage Return	
\t	    Tab	
\b	    Backspace	
\f	    Form Feed 
-----------------------------------
*/