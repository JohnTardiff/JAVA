package Chapter07;

import java.util.*;

/**
 * program to get the average of a certain amount of values given by the user
 *
 * @author John Tardiff
 */
public class P7 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int x = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(x);

        fillArray(numbers, input, x);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * method to fill the array with values given by the user
     *
     * @param numbers array to contain numbers given by the user
     * @param input input given by the user
     * @param x size of the list of numbers determined by the user
     */
    public static void fillArray(ArrayList<Integer> numbers, Scanner input, int x) {
        System.out.print("Enter " + x + " elements: ");
        for (int i = 0; i < x; i++) {
            numbers.add(input.nextInt());
        }
    }

    /**
     * method to get the average of all the numbers in the array
     *
     * @param numbers array storing the numbers given by the user
     * @return the average of the numbers in the array
     */
    public static double average(ArrayList<Integer> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        return sum / numbers.size();
    }

    /**
     * method to print out the contents of the array
     *
     * @param numbers array containing the numbers being displayed
     */
    public static void displayArray(ArrayList<Integer> numbers) {
        System.out.println("The contents of the array: " + numbers);
    }
}
