/*
Javadoc - 02
Exercise: javadoc-2
create a class called Tester that has the main method where you:
create a new ArithmeticOperators object
print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
add Javadoc comments to:
the 2 classes with a short description and the author
the 5 methods with a short description, the parameters and the return value
create a folder called GeneratedJavadoc under the main project folder
generate the Javadoc file using the IntelliJ Javadoc plugin right inside the newly created folder
explore the freshly generated Javadoc
 */

/**
 * @author Davide
 * This class tests the methods of the ArithmeticOperators class
 */
public class Tester {

    /**
     *This main method creates two integer instance variables and an object of the ArithmeticOperators class.
     * The object will use the two variables as parameters.
     * @param args not used
     */
    public static void main(String[] args) {
        ArithmeticOperators operators = new ArithmeticOperators();
        int num1 = 48;
        int num2 = 2;

        System.out.printf("The numbers are %d and %d%n" +
                        "Sum: %d%n" +
                        "Subtraction: %d%n" +
                        "Multiplication: %d%n" +
                        "Division: %d",
                num1, num2,
                operators.sum(num1,num2),
                operators.sub(num1,num2),
                operators.mul(num1,num2),
                operators.div(num1,num2));
    }
}
