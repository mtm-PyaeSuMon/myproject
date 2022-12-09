package tutorial;

import java.util.Scanner;

public class TutorialTwoGreatestNum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();
        System.out.println("Enter Third Number");
        num3 = sc.nextInt();
        // condition
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest number: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 is greatest number: " + num3);
        } else {
            System.out.println("The numbers are same....");
        }
    }

}
