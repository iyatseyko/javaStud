package StudyProject.StringOperations;

import StudyProject.RunnerClass;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class StringRunner {
    static Logger logger = Logger.getLogger(StringRunner.class);

    public static void stringRun() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You choose operations with string");

        boolean operationNumber = false;
        while (operationNumber == false) {
            System.out.println("\nEnter 1 to choose Polindrome, 2 for StringReverse");
            int operation = scan.nextInt();
            String inputString;
            switch (operation) {
                case 1:
                    System.out.println("\nPlease, type a string value");
                    scan.nextLine();
                    inputString = scan.nextLine();
                    if(Polyndrome.checkIsTheWordAPolindrom(inputString)){
                        System.out.println("Current string is a polyndrome\n");
                    } else {
                        System.out.println("Current string is NOT a polyndrome\n");
                    }
                    break;
                case 2:
                    System.out.println("\nPlease, type a string value");
                    scan.nextLine();
                    inputString = scan.nextLine();
                    System.out.println("Resverse string is - ".concat(StringReverse.stringReverse(inputString)).concat("\n"));
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

    private static boolean goBack(){
        RunnerClass.isException=true;
        return RunnerClass.isException;
    }
}
