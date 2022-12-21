package tutorial;

import java.util.Scanner;

/**
 * <h2>TutorialTwoLeapYearClass</h2>
 * <p>
 * Process for DisplayingTutorialTwoLeapYear
 * </p>
 *
 * @author PyaeSuMon
 *
 */
public class TutorialTwoLeapYear {

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
        int year;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter Year: ");
        if (sc.hasNextInt()) {
            year = sc.nextInt();
            // condition
            if (year > 0) {
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                    System.out.println(year + " is a leap year");

                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println("Year with minus does not exist");
            }
        } else {
            System.out.println("This is not a number");
        }
    }

}
