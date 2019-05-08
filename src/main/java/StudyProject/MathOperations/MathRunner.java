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
        System.out.println("\nEnter 1 to choose min operation, 2 for max, 3 for average");

        boolean operationNumber = false;
        while (operationNumber == false) {
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("\nThe minimum value is ".concat(Integer.toString(MathOperation.min(typeArray()))).concat("\n\nEnter 1 to choose min operation, 2 for max, 3 for average"));
                    break;
                case 2:
                    System.out.println("\nThe maximum value is ".concat(Integer.toString(MathOperation.max(typeArray()))).concat("\n\nEnter 1 to choose min operation, 2 for max, 3 for average"));
                    break;
                case 3:
                    System.out.println("\nThe average value is ".concat(Double.toString(MathOperation.average(typeArray()))).concat("\n6Enter 1 to choose min operation, 2 for max, 3 for average"));
                    break;
                case 4:
                    operationNumber = true;
                    System.out.println("YOU COME BACK TO PREVIOUS STEP");
                    goBack();
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

    private static boolean goBack(){
        RunnerClass.isException=true;
        return RunnerClass.isException;

    }
}
