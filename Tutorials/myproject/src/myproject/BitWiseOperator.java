package myproject;

/**
 * <h2>BitWiseOperatorClass</h2>
 * <p>
 * Process for DisplayingBitWiseOperator
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class BitWiseOperator {

    /**
     * <h2>main
     * <p>
     *
     * </p>
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        int num1 = 50, num2 = 20;

        // Bitwise AND
        System.out.println("num1 & num2 = " + (num1 & num2));

        // Bitwise OR
        System.out.println("num1 | num2 = " + (num1 | num2));

        // Bitwise XOR
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));

        // Binary Complement Operator
        System.out.println("~num1 = " + ~num1);

    }
}
