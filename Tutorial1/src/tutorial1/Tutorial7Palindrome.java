package tutorial1;

import java.util.Scanner;

public class Tutorial7Palindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str, revert = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string you want to check palindrome or not : ");
        str = sc.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            revert = revert + str.charAt(i);
        }
        if (str.equals(revert)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}
