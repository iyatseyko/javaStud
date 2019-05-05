package StudyProject.MathOperations;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class MathRunner {
    static Logger logger = Logger.getLogger(MathRunner.class);

    public static void mathRun() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You choose math operations with numbers. Now, type array of numbers.\nFor the array you should define a length at first. Please, type the array's length");
        int[] integers = new int[scan.nextInt()];

        System.out.println("Lenth of your array is ".concat(Integer.toString(integers.length)));
        for (int counter = 0; counter < integers.length; counter++) {
            System.out.println("Please, enter ".concat(Integer.toString(counter + 1)).concat(" number of array"));
            integers[counter] = scan.nextInt();
        }
        System.out.print("Your array is ".concat(Arrays.toString(integers)));

        System.out.println("\nEnter 1 to choose min operation, 2 for max, 3 for average");

        boolean operationNumber = false;
        while (operationNumber == false) {
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    operationNumber = true;
                    System.out.println("The minimum value is ".concat(Integer.toString(MathOperation.min(integers))).concat("\nFINISH"));
                    break;
                case 2:
                    operationNumber = true;
                    System.out.println("The maximum value is ".concat(Integer.toString(MathOperation.max(integers))).concat("\nFINISH"));
                    break;
                case 3:
                    operationNumber = true;
                    System.out.println("The average value is ".concat(Double.toString(MathOperation.average(integers))).concat("\nFINISH"));
                    break;
                case 0:
                    operationNumber = true;
                    System.out.println("EXIT");
                    break;
                default:
                    logger.error("Sorry, but you type incorrect number !!\nPlease, try again");
                    break;
            }
        }
    }
}
