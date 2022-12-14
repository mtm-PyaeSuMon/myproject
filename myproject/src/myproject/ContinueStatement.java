package myproject;

/**
 * <h2>ContinueStatementClass</h2>
 * <p>
 * Process for DisplayingContinueStatement
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class ContinueStatement {

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
            if (i == 11) {
                continue;
            }
            System.out.println(i);
        }
    }

}
