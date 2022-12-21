package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h2>TutorialFourSwapClass</h2>
 * <p>
 * Process for DisplayingTutorialFourSwap
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialFourSwap {

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
        List<String> list = new ArrayList<>();
        // add element to array list
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        // print original array list
        System.out.println("Original List : " + list);
        // swap black and red using collections
        Collections.swap(list, 2, 0);
        // print list after swap
        System.out.println("List after swap : " + list);
    }

}
