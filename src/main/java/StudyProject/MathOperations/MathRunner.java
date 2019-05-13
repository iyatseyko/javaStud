package StudyProject.MathOperations;

import StudyProject.RunnerClass;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class MathRunner {

    static Scanner scan = new Scanner(System.in);
    static Logger logger = Logger.getLogger(MathRunner.class);

    public static void mathRun() {
        System.out.println("You choose math operations with numbers");

        boolean operationNumber = true;
        while (operationNumber) {
            String message = "\nEnter 1 to choose min operation, 2 for max, 3 for average";
            System.out.println(message);
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("\nThe minimum value is ".concat(Integer.toString(MathOperation.min(typeArray()))));
                    break;
                case 2:
                    System.out.println("\nThe maximum value is ".concat(Integer.toString(MathOperation.max(typeArray()))));
                    break;
                case 3:
                    System.out.println("\nThe average value is ".concat(Double.toString(MathOperation.average(typeArray()))));
                    break;
                case 4:
                    operationNumber = false;
                    System.out.println("YOU COME BACK TO PREVIOUS STEP");
                    RunnerClass.goBack();
                    break;
                case 0:
                    operationNumber = false;
                    System.out.println("EXIT");
                    break;
                default:
                    logger.error("Sorry, but you type incorrect number !!\nPlease, try again");
                    break;
            }
        }
    }

    private static int[] typeArray() {
        System.out.println("Now, type array of numbers.\nFor the array you should define a length at first. Please, type the array's length");

        int[] integers = new int[scan.nextInt()];

        System.out.println("Lenth of your array is ".concat(Integer.toString(integers.length)));
        for (int counter = 0; counter < integers.length; counter++) {
            System.out.println("Please, enter ".concat(Integer.toString(counter + 1)).concat(" number of array"));
            integers[counter] = scan.nextInt();
        }
        System.out.print("Your array is ".concat(Arrays.toString(integers)));
        return integers;
    }
}
