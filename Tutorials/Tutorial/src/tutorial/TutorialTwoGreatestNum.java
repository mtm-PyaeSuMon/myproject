package tutorial;

import java.util.Scanner;

/**
 * <h2>TutorialTwoGreatestNumClass</h2>
 * <p>
 * Process for DisplayingTutorialTwoGreatestNum
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialTwoGreatestNum {

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
        int num1, num2, num3;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter First Number");
        // condition
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            num2 = sc.nextInt();
            System.out.println("Enter Third Number");
            num3 = sc.nextInt();
            if ((num1 > num2 && num1 > num3)) {
                System.out.println("num1 is greatest number: " + num1);
            } else if (num2 > num3) {
                System.out.println("num2 is greatest number: " + num2);
            } else if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
                System.out.println("The numbers are same......");
            } else {
                System.out.println("num3 is greatest number: " + num3);
            }
        } else {
            System.out.println("Enter input is not a number");
        }
    }
}
