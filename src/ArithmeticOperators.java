/*
Javadoc - 02
Exercise: javadoc-2
have a quick look at the Java arithmetic operators
create a class called ArithmeticOperators that has 4 methods:
sum() method that takes 2 int parameters as input called num1 and num2 and returns their summation int
sub() method that takes 2 int parameters as input called num1 and num2 and returns their subtraction int
mul() method that takes 2 int parameters as input called num1 and num2 and returns their multiplication int
div() method that takes 2 int parameters as input called num1 and num2 and returns their division int
 */

/**
 * This class includes basic arithmetic operations (sum, subtraction, multiplication and division)
 */
public class ArithmeticOperators {
    /**
     * Sum method
     * @param num1 first integer
     * @param num2 second integer
     * @return the sum of num1 with num2
     */
    public int sum(int num1, int num2){
        return num1+num2;
    }

    /**
     * Subtraction method
     * @param num1 integer minuend
     * @param num2 integer subtrahend
     * @return the difference between num1 and num2
     */
    public int sub(int num1, int num2){
        return num1-num2;
    }

    /**
     * Multiplication method
     * @param num1 integer multiplicand
     * @param num2 integer multiplier
     * @return the product between num1 and num2
     */
    public int mul(int num1, int num2){
        return num1*num2;
    }
    /**
     * Division method
     * @param num1 integer numerator
     * @param num2 integer divisor
     * @return the quotient of num1 and num2 without rest
     */
    public int div(int num1, int num2){
        return num1/num2;
    }
}
