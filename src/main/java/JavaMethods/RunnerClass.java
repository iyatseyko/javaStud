package JavaMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {

        int[] integers = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to use math operations - please, type 1; \nOtherwise type 2 for Polyndrome and StringReverse methods.");
    try {

        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("You choose math operations with numbers. Now, type array of numbers.\nFor the array you should define a length at first. Please, type the array's length");
            integers = new int[scan.nextInt()];
            System.out.println("Lenth of your array is ".concat(Integer.toString(integers.length)));
            for (int counter = 0; counter < integers.length; counter++) {
            System.out.println("Please, enter ".concat(Integer.toString(counter + 1)).concat(" number of array"));
            integers[counter] = scan.nextInt();
            }
            System.out.print("Your array is ".concat(Arrays.toString(integers)));

            System.out.println("Enter 1 to choose min operation, 2 for max, 3 for average");

            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.println(MathOperation.min(integers));
                    break;
                case 2:
                    System.out.println(MathOperation.max(integers));
                    break;
                case 3:
                    System.out.println(MathOperation.average(integers));
                    break;
                default:
                    System.out.println("Sorry, but you type incorrect number !!");
                    break;
            }

        } else if (number == 2) {
            System.out.println("Please, type a string value");
                scan.nextLine();
             String inputSting = scan.nextLine();

            System.out.println("Enter 1 to choose Polindrome, 2 for StringReverse");
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.println();
                    System.out.println(Polyndrome.checkIsTheWordAPolindrom(inputSting));
                    break;
                case 2:
                    System.out.println(StringReverse.stringReverse(inputSting));
                    break;
                default:
                    System.out.println("Sorry, but you type incorrect number !!");
                    break;
            }
        } else {
            System.out.println("Sorry, but you type incorrect number !!");
        }
    } catch (InputMismatchException e){
        System.out.println("You type incorrect number or character !!");
    }
    }
}
