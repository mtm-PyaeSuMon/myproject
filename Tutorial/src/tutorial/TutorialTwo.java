package tutorial;
import java.util.Scanner;
public class TutorialTwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        //enter user input
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        //condition
        if (num > 0){
        System.out.println("Given number is a positive integer");
        } else if(num < 0){
        System.out.println("Given number is a negative integer");
        } else {
        System.out.println("Given input is wrong type");
        }
    }

}
