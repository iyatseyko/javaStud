package StudyProject.StringOperations;

import StudyProject.RunnerClass;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class StringRunner {
    static Logger logger = Logger.getLogger(StringRunner.class);

    public static void stringRun() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You choose operations with string");

        boolean operationNumber = true;
        while (operationNumber) {
            System.out.println("\nEnter 1 to choose Palindrome, 2 for StringReverse");
            int operation = scan.nextInt();
            String inputString;
            switch (operation) {
                case 1:
                    System.out.println("\nPlease, type a string value");
                    scan.nextLine();
                    inputString = scan.nextLine();
                    if(Polyndrome.checkIsTheWordAPolindrom(inputString)){
                        System.out.println("Current string is a palindrome\n");
                    } else {
                        System.out.println("Current string is NOT a palindrome\n");
                    }
                    break;
                case 2:
                    System.out.println("\nPlease, type a string value");
                    scan.nextLine();
                    inputString = scan.nextLine();
                    System.out.println("Resverse string is - ".concat(StringReverse.stringReverse(inputString)).concat("\n"));
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
}
