import java.util.Scanner;


public class Main {

    public static int intInput() throws NumberFormatException, NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true){
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Error type! Please enter an integer value");
                scanner.next();
            }
        }
        return input;
    }

    public static void main(String[] args) {


        System.out.println("Creating a fraction using default constructor:");
        Fraction testFraction = new Fraction(); // 1/1 Fraction
        System.out.println("Created fraction: " + testFraction);

        System.out.println("Creating a fraction using 2 parameters constructor:");
        System.out.println("Enter numerator and denominator (use Enter): ");
        Fraction testFraction1 = new Fraction(intInput(), intInput()); // Creating a fraction via safe input
        System.out.println("Your fraction: " + testFraction1);

        System.out.println("Testing sum, subtraction, multiply and divide methods: ");
        System.out.println("Enter первую дробь: ");
        Fraction testFractionSum1 = new Fraction(intInput(), intInput());
        System.out.println("Your fraction: " + testFractionSum1);
        Fraction testFractionSubtract1 = new Fraction(testFractionSum1);
        Fraction testFractionMultiply1 = new Fraction(testFractionSum1);
        Fraction testFractionDivide1 = new Fraction(testFractionSum1);
        System.out.println("Enter вторую дробь: ");
        Fraction testFractionSum2 = new Fraction(intInput(), intInput());
        System.out.println("Your fraction: " + testFractionSum2);
        Fraction testFractionSubtract2 = new Fraction(testFractionSum2);
        Fraction testFractionMultiply2 = new Fraction(testFractionSum2);
        Fraction testFractionDivide2 = new Fraction(testFractionSum2);

        System.out.println("Sum of your fractions using two methods:");
        testFraction = new Fraction(testFraction.sum(testFractionSum1, testFractionSum2));
        System.out.println("Sum using two parameters: " + testFraction);
        testFractionSum1.sum(testFractionSum2);
        System.out.println("Sum using one parameter: " + testFractionSum1);

        System.out.println("Subtraction of your fractions using two methods:");
        testFraction = new Fraction(testFraction.subtract(testFractionSubtract1, testFractionSubtract2));
        System.out.println("Subtraction using two parameters: " + testFraction);
        testFractionSubtract1.subtract(testFractionSubtract2);
        System.out.println("Subtraction using one parameter: " + testFractionSubtract1);

        System.out.println("Multiplication of your fractions using two methods:");
        Fraction testFractionMultiply = new Fraction(testFraction.multiply(testFractionMultiply1, testFractionMultiply2));
        System.out.println("Multiplication using two parameters: " + testFractionMultiply);
        testFractionMultiply1.multiply(testFractionMultiply2);
        System.out.println("Multiplication using one parameter: " + testFractionMultiply1);

        System.out.println("Divide of your fractions using two methods:");
        Fraction testFractionDivide = new Fraction(testFraction.divide(testFractionDivide1, testFractionDivide2));
        System.out.println("Divide using two parameters: " + testFractionDivide);
        testFractionDivide1.divide(testFractionDivide2);
        System.out.println("Divide using one parameter: " + testFractionDivide1);

    }
}
