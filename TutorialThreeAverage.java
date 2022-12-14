package tutorial;

import java.util.Scanner;

/**
 * <h2>TutorialThreeAverageClass</h2>
 * <p>
 * Process for DisplayingTutorialThreeAverage
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialThreeAverage {

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
        // reading the array size.
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter array size: ");
        if (sc.hasNextInt()) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter array values " + (i + 1) + ": ");
                int value = sc.nextInt();
                array[i] = value;
            }
            int length = array.length;
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            // calculate average
            float average = (float) sum / (float) length;
            System.out.println("Average of array : " + average);

        } else {
            System.out.println("This is not a number");
        }
    }
}
