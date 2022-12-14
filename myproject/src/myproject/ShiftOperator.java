package myproject;

/**
 * <h2>ShiftOperatorClass</h2>
 * <p>
 * Process for DisplayingShiftOperator
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class ShiftOperator {

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
        // Binary Left Shift Operator
        int num1 = 50, num2 = 10, num3 = 0;
        num3 = num1 << 2;
        System.out.println("num1 << 1 = " + num3);

        // Binary Right Shift Operator
        num3 = num2 >> 2;
        System.out.println("num1 >> 1  = " + num3);

        // Shift right zero fill operator
        num3 = num1 >>> 2;
        System.out.println("num1 >>> 1 = " + num3);
    }

}
