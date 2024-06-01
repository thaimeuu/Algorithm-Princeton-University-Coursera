// Lesson 1: Java Variables.

// ================================= VARIABLES ==============================================

/*In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false */

// ================================= PRINT VARIABLES ==============================================

/*To combine both text and a variable, use the + character,
You can also use the + character to add a variable to another variable,
For numeric values, the + character works as a mathematical operator */

// ================================= MULTIPLE VARIABLES ==============================================

/* To declare more than one variable of the same type, you can use a comma-separated list,
* You can also assign the same value to multiple variables in one line */
// ===================================================================================================

public class JavaVariables {
    public static void main(String[] args) {
        System.out.println("Lesson 1: Variables");
        // ===================VARIABLES===========================
        // Create/Declare 
        String name = "Nguyen Lam Thai";
        System.out.println(name);
        // Declare and Specify value separately
        int age;
        age = 21;
        System.out.println(age);
        // Create constant variables.
        final String language = "Java";
        // language = "python"; // this will raise an error

        // =================PRINT VARIABLES========================
        // Combine
        System.out.println(name + " is " + age + " years old.");
        // Add Variables
        String favorite = "python and " + language;
        System.out.println("My favorite programming languages are " + favorite);

        // ==================MULTIPLE VARIABLES====================
        // Simultaneously declare
        int date = 1, month = 6, year = 2024;
        System.out.println("Today is " + month + "/" + date + "/" + year);
        // Multiple variables to one value
        String first_name, country_name;
        first_name = country_name = "Thai";
        System.out.println(first_name + " (name) is different thing from (country) " + country_name);
    }
}

// ======================================IDENTIFIERS======================================

/* Identifiers

- All Java variables must be identified with unique names.
- These unique names are called identifiers.
- Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
- Note: It is recommended to use descriptive names in order to create understandable and maintainable code: 

  The general rules for naming variables are:

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, and cannot contain whitespace
- Names can also begin with $ and _ (but we will not use it in this tutorial)
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names*/

// =========================================================================================