package tutorial;

import java.util.Scanner;

public class TutorialThreeAverage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // reading the array size.
        Scanner sc = new Scanner(System.in);
        // enter user input
        System.out.println("Enter array size: ");
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
        //calculate average
        double average = sum / length;
        System.out.println("Average of array : " + average);

    }
}
