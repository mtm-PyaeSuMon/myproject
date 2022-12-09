package tutorial;

import java.util.Arrays;

public class TutorialThreeRemoveArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] myArray = { 25, 14, 56, 15, 36 };
        System.out.println("Original Array : " + Arrays.toString(myArray));
        // remove the first element
        int removeIndex = 0;
        for (int i = removeIndex; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        System.out.println("After remove first index : " + Arrays.toString(myArray));
    }

}
