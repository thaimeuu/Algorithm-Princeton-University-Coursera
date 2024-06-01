// Lesson 2: Data Types.

// ===============================================DATA TYPES================================================================

/* Data types are divided into two groups:
- Primitive data types - includes byte, short, int, long, float, double, boolean and char
- Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter) */

// =============================================PRIMITIVE DATA TYPES========================================================

/* Primitive Data Types
- A primitive data type specifies the size and type of variable values, and it has no additional methods.
- There are eight primitive data types in Java: 

Data Type	Size	            Description
---------------------------------------------------------------------------------------------------------
byte	    1 byte	        Stores whole numbers from -128 to 127
short	    2 bytes	        Stores whole numbers from -32,768 to 32,767
int	        4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes	        Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	    1 bit	        Stores true or false values
char	    2 bytes	        Stores a single character/letter or ASCII values
---------------------------------------------------------------------------------------------------------
*/

// ============================================NUMBERS===============================================

/* Numbers
- Primitive number types are divided into two groups:
- Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
- Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double. */

/* Use float or double?
- The precision of a floating point value indicates how many digits the value can have after the decimal point. 
- The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
- Therefore it is safer to use double for most calculations. */

// ==========================================CHARACTERS=================================================

/* The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c' 
 * if you are familiar with ASCII values, you can use those to display certain characters
*/

public class JavaDataTypes {
    public static void main(String[] args) {
        System.out.println("Lesson 2: Data Types");
        // characters
        char myGrade = 'A';
        System.out.println(myGrade);
        char myVar1 = 66, myVar2 = 67, myVar3 = 68;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
}

// ===========================================NON-PRIMITIVE DATA TYPES========================================================

/* Non-Primitive Data Types
- Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:
- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
- A primitive type has always a value, while non-primitive types can be null.
- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
- Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter. */