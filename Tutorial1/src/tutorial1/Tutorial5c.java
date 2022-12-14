package tutorial1;

import java.util.*;

/**
 * <h2>Tutorial5cClass</h2>
 * <p>
 * Process for DisplayingTutorial5c
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial5c {

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
        HashMap<String, Integer> animals = new HashMap<String, Integer>();
        animals.put("Dog", 1);
        animals.put("Cat", 2);
        animals.put("Tiger", 3);
        animals.put("Leo", 4);
        animals.put("Bird", 5);
        animals.put("Mouse", 6);
        // print the map
        System.out.println("Original map is : " + animals);
        // condition1
        System.out.println("Is key 'Cat' exists? ");
        if (animals.containsKey("Cat")) {
            // key exists
            System.out.println("Yes!");
        } else {
            // key does not exists
            System.out.println("No!");
        }

        // condition2
        System.out.println("Is key 'Monkey' exists? ");
        if (animals.containsKey("Monkey")) {
            // key exists
            System.out.println("Yes!");
        } else {
            // key does not exists
            System.out.println("No!");
        }
    }

}
