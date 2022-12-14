package tutorial1;

import java.util.*;

/**
 *<h2>Tutorial5aClass</h2>
 *<p>
 *Process for DisplayingTutorial5a
 *</p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial5a {

    /**
     *<h2>main
     *<p>
     *
     *</p>
     *
     * @param args
     *@return void
     */
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Yellow");
        colors.put(3, "Black");
        colors.put(4, "Pink");
        colors.put(5, "Red");
        colors.put(6, "Brown");
        colors.put(7, "Blue");
        System.out.println(colors);
        for (@SuppressWarnings("rawtypes") Map.Entry x : colors.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

}
