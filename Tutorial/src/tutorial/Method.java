package tutorial;

/**
 * <h2>MethodClass</h2>
 * <p>
 * Process for DisplayingMethod
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Method {
    /**
     * <h2>myMethod
     * <p>
     *
     * </p>
     *
     * @param name
     * @param age
     * @return void
     */
    static void myMethod(String name, int age) {
        System.out.println(name + " age is " + age);
    }

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
        myMethod("Mg Mg", 23);
        myMethod("Zar Zar", 22);
        myMethod("Thu Zar", 25);
    }

}
