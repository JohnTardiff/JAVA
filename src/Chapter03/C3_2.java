package Chapter03;

import java.util.Scanner;

/**
 * Program to display a palindrome
 *
 * @author Shahim Panjwani
 */
public class C3_2 {

    /**
     * Main Method
     *
     * @param args from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int position1 = number / 100;
        int position3 = number % 10;

        System.out.println(number + (position1 == position3 ? " is " : " is not ") + "a palindrome");
    }
}
