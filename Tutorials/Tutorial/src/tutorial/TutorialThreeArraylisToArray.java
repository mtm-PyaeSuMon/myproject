package tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>TutorialThreeArraylisToArrayClass</h2>
 * <p>
 * Process for DisplayingTutorialThreeArraylisToArray
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialThreeArraylisToArray {

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
        // Add element to the list
        list.add("Python");
        list.add("Java");
        list.add("Php");
        list.add("perl");
        list.add("C#");
        // convert array list to array
        String[] array = list.toArray(new String[0]);
        // print the array
        for (String st : array) {
            System.out.println(st);
        }
    }

}
