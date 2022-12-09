package tutorial;

import java.util.Scanner;

public class TutorialTwoLeapYear {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int year;
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter Year: ");
        year = sc.nextInt();
        // condition
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
