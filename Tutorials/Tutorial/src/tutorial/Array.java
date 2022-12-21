package tutorial;

/**
 * <h2>ArrayClass</h2>
 * <p>
 * Process for DisplayingArray
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Array {

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
        String[] fruits = { "Strawberry", "Orange", "Mango", "Banana" };
        fruits[1] = "Apple";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }

}
