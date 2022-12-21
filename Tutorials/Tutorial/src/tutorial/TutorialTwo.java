package tutorial;

import java.util.Scanner;

/**
 * <h2>TutorialTwoClass</h2>
 * <p>
 * Process for DisplayingTutorialTwo
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialTwo {

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
        int num;
        // enter user input
        System.out.println("Enter a number :");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // condition
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num > 0) {
                System.out.println("Given number is a positive integer");
            } else if (num < 0) {
                System.out.println("Given number is a negative integer");
            } else if (num == 0) {
                System.out.println("It's number zero");
            } else {
                System.out.println("Given input is wrong type");
            }
        } else {
            System.out.println("This is not a number");
        }
    }

}
