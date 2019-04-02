package JavaMethods;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("If you want to use math operations - please, type the array of numbers;\nOtherwise insert a string value for Polyndrome and StringReverse methods.\nFor the array you should define a length at first");

        String inputSting = "";
        int[] integers = null;
        if (scan.hasNextInt()){

            integers = new int[scan.nextInt()];

            for (int counter = 1; counter < integers.length; counter++) {
                System.out.println("Please, enter ".concat(Integer.toString(counter)).concat(" number of array"));
                integers[counter] = scan.nextInt();

                System.out.print("You array is " + Arrays.toString(integers));


            }
        } else {
            inputSting = scan.nextLine();
        }

        System.out.println("Enter 1 to choose min operation, 2 for max, 3 for average, 4 for reverse, 5 for polyndrome");

        int operation = scan.nextInt();

        switch (operation) {
            case 1:
                MathOperation.min(integers);
                break;
            case 2:
                MathOperation.max(integers);
                break;
            case 3:
                System.out.println(MathOperation.average(integers));
                break;
            case 4:
                System.out.println();
                System.out.println(Polyndrome.checkIsTheWordAPolindrom(inputSting));
                break;
            case 5:
                System.out.println(StringReverse.stringReverse(inputSting));
                break;
            default:
                System.out.println("The other operation was chosen");
                break;
        }
    }
}
