package StudyProject.StringOperations;

import java.util.Scanner;

public class StringRunner {

    public static void stringRun() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You choose operations with string");
        System.out.println("\nEnter 1 to choose Polindrome, 2 for StringReverse");
        System.out.println("\nPlease, type a string value");
        scan.nextLine();
        String inputSting = scan.nextLine();

        boolean operationNumber = false;
        while (operationNumber == false) {
            int operation = scan.nextInt();
            switch (operation) {
                case 1:
                    operationNumber = true;
                    System.out.println(Polyndrome.checkIsTheWordAPolindrom(inputSting));
                    break;
                case 2:
                    operationNumber = true;
                    System.out.println(StringReverse.stringReverse(inputSting));
                    break;
                default:
                    System.out.println("Sorry, but you type incorrect number !!\nPlease, try again");
                    break;
            }
        }
    }
}
