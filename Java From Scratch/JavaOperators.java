// Lesson 4: Operators

// ================OPERATORS====================================

/* Java divides the operators into the following groups:
- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators */

// ====================Arithmetic Operators======================

/* Arithmetic Operators
Arithmetic operators are used to perform common mathematical operations. 

Operator	Name	        Description	                                Example
--------------------------------------------------------------------------------
+	        Addition	    Adds together two values	                x + y	
-	        Subtraction	    Subtracts one value from another	        x - y	
*	        Multiplication	Multiplies two values	                    x * y	
/	        Division	    Divides one value by another	            x / y	
%	        Modulus	        Returns the division remainder	            x % y	
++	        Increment	    Increases the value of a variable by 1	    ++x	
--	        Decrement	    Decreases the value of a variable by 1	    --x
--------------------------------------------------------------------------------
*/

// ====================Assignment Operators=============================

/* Java Assignment Operators
Assignment operators are used to assign values to variables. 

Operator	Example	    Same As
-----------------------------------------
=	        x = 5	    x = 5	
+=	        x += 3	    x = x + 3	
-=	        x -= 3	    x = x - 3	
*=	        x *= 3	    x = x * 3	
/=	        x /= 3	    x = x / 3	
%=	        x %= 3	    x = x % 3	
&=	        x &= 3	    x = x & 3	
|=	        x |= 3	    x = x | 3	
^=	        x ^= 3	    x = x ^ 3	
>>=	        x >>= 3	    x = x >> 3	
<<=	        x <<= 3	    x = x << 3
-----------------------------------------
*/


public class JavaOperators {
    public static void main(String[] args) {
        System.out.println("Lesson 4: Operators");
        // Increment
        int x = 1;
        ++x;
        System.out.println("This is x after increment: " + x);
        // Logic operators
        System.out.println(5 > 0 && 0 < 3);
        System.out.println(5 < 4 || 4 < 3);
    }
}
