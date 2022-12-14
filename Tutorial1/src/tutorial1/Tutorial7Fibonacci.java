package tutorial1;

/**
 * <h2>Tutorial7FibonacciClass</h2>
 * <p>
 * Process for DisplayingTutorial7Fibonacci
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial7Fibonacci {

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
        int n1 = 1, n2 = 2, n3, i, count = 10;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
