package tutorial;

import java.util.ArrayList;
import java.util.List;

public class TutorialThreeArraylisToArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
