package tutorial1;

import java.util.HashMap;

/**
 * <h2>JavaHashmapClass</h2>
 * <p>
 * Process for DisplayingJavaHashmap
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class JavaHashmap {

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
        HashMap<Integer, String> city = new HashMap<>();

        city.put(1, "Yangon");
        city.put(2, "Mandalay");
        city.put(3, "Bago");
        System.out.println("HashMap: " + city);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + city.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + city.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + city.entrySet());
    }

}
