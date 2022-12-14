package myproject;

/**
 * <h2>BreakStatementClass</h2>
 * <p>
 * Process for DisplayingBreakStatement
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class BreakStatement {

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
        for (int i = 0; i < 20; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }

}
