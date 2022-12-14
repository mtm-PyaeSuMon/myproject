package myproject;

/**
 * <h2>ReturnStatementClass</h2>
 * <p>
 * Process for DisplayingReturnStatement
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class ReturnStatement {
    /* Method with an integer return type and no arguments */
    /**
     * <h2>CompareNum
     * <p>
     *
     * </p>
     *
     * @return
     * @return int
     */
    public int CompareNum() {
        int x = 3;
        int y = 8;
        System.out.println("x = " + x + "\ny = " + y);
        if (x > y)
            return x;
        else
            return y;
    }

    /**
     * <h2>main
     * <p>
     *
     * </p>
     *
     * @param ar
     * @return void
     */
    public static void main(String ar[]) {
        ReturnStatement obj = new ReturnStatement();
        int result = obj.CompareNum();
        System.out.println(result);
    }
}
