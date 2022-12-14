package tutorial1;

import java.util.Scanner;

/**
 *<h2>Tutorial7PalindromeClass</h2>
 *<p>
 *Process for DisplayingTutorial7Palindrome
 *</p>
 *
 * @author PyaeSuMon
 *
 */
public class Tutorial7Palindrome {

    /**
     *<h2>main
     *<p>
     *
     *</p>
     *
     * @param args
     *@return void
     */
    public static void main(String[] args) {
        String str, revert = "";
        @SuppressWarnings("resource")
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
