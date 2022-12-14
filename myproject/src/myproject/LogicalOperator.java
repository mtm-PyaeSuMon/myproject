package myproject;

/**
 * <h2>LogicalOperatorClass</h2>
 * <p>
 * Process for DisplayingLogicalOperator
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class LogicalOperator {

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
        int x = 6;
        // logical AND
        System.out.println(x > 10 && x < 5);
        // logical OR
        System.out.println(x < 10 || x > 20);
        // Logical NOT
        System.out.println(!(x < 10 && x > 5));
    }

}
