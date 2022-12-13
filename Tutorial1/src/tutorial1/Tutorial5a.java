package tutorial1;

import java.util.*;

public class Tutorial5a {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Yellow");
        colors.put(3, "Black");
        colors.put(4, "Pink");
        colors.put(5, "Red");
        colors.put(6, "Brown");
        colors.put(7, "Blue");
        System.out.println(colors);
        for (Map.Entry x : colors.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

}
