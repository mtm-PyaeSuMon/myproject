package tutorial;

import java.util.Scanner;

public class TutorialOne {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
