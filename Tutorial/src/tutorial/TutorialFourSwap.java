package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TutorialFourSwap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
