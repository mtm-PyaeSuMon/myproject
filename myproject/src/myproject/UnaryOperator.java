package myproject;

/**
 * <h2>UnaryOperatorClass</h2>
 * <p>
 * Process for DisplayingUnaryOperator
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class UnaryOperator {

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
        int x = 5, y = 6, z = 7;
        System.out.println("x : " + x++);
        System.out.println("x : " + x);
        System.out.println("y : " + y--);
        System.out.println("y : " + y);
        System.out.println("z : " + ++z);
        System.out.println("z : " + --z);
    }

}
