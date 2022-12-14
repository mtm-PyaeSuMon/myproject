package tutorial;

import java.util.Scanner;

/**
 * <h2>TutorialOneClass</h2>
 * <p>
 * Process for DisplayingTutorialOne
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialOne {

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
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= number; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= number; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
