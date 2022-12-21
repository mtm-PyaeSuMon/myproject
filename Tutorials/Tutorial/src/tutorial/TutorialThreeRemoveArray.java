package tutorial;

import java.util.Arrays;

/**
 * <h2>TutorialThreeRemoveArrayClass</h2>
 * <p>
 * Process for DisplayingTutorialThreeRemoveArray
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialThreeRemoveArray {

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
        int[] myArray = new int[] { 25, 14, 56, 15, 36 };
        System.out.println("Original Array : " + Arrays.toString(myArray));
        int[] myArray_new = new int[myArray.length - 1];
        // remove the first element
        int removeIndex = 0;
        for (int i = 0, k = 0; i < myArray.length; i++) {
            if (i != removeIndex) {
                myArray_new[k] = myArray[i];
                k++;
            }
        }
        System.out.println("After remove first index : " + Arrays.toString(myArray_new));
    }

}
