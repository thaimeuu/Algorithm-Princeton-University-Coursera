// Lesson 7: If Else

/* Java has the following conditional statements:
- Use if to specify a block of code to be executed, if a specified condition is true
- Use else to specify a block of code to be executed, if the same condition is false
- Use else if to specify a new condition to test, if the first condition is false
- Use switch to specify many alternative blocks of code to be executed*/

// Short Hand if...else

/* Syntax: variable = (condition) ? expressionTrue :  expressionFalse; */

public class JavaConditional {
    public static void main(String[] args) {
        System.out.println("Lesson 7: If Else");
        // If Else
        int age = 21;
        int voting_entry = 21;
        if (age >= voting_entry){
            System.out.println("Eligible");
        } else if (age >= 18) {
            System.out.println("Wait " + (voting_entry - age) + " years and you are eligible");
        } else {
            System.out.println("You are just too young.");
        }
        // Short hand If Else
        float gpa = 3.35f;
        boolean isPass = (gpa >= 3.2) ? true : false;
        System.out.println("isPass: " + isPass);
    }
}
