package tutorial1;

import java.util.*;

public class Tutorial5b {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // create two hash maps
        HashMap<Integer, String> fruit = new HashMap<Integer, String>();
        HashMap<Integer, String> juice = new HashMap<Integer, String>();
        // populate hash maps
        fruit.put(1, "Apple");
        fruit.put(2, "Strawberry");
        fruit.put(3, "Orange");
        fruit.put(4, "Banana");
        System.out.println("Value in Fruits :: " + fruit);
        juice.put(5, "Apple Juice");
        juice.put(6, "Strawberry Juice");
        juice.put(7, "Orange Juice");
        juice.put(8, "Banana Juice");
        System.out.println("Value in Juice :: " + juice);
        // push all value in juice
        juice.putAll(fruit);
        System.out.println("Now value in Juice :: " + juice);
    }

}
