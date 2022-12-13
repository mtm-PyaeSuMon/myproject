package tutorial1;

import java.util.*;

public class Tutorial5c {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
