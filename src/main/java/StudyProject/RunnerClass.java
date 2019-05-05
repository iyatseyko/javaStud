package StudyProject;

import StudyProject.EmployeeCreation.*;
import StudyProject.MathOperations.MathRunner;
import StudyProject.StringOperations.StringRunner;

import java.util.*;
import org.apache.log4j.Logger;


public class RunnerClass {
    static Logger logger = Logger.getLogger(RunnerClass.class);

    public static void main(String[] args) {

    boolean isException;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("If you want to use math operations - please, type 1; \nIf you want Polyndrome or StringReverse methods - type 2;\nIf you want read employee info from CSV file - type 3;\nTo EXIT from the program - type 0");
            isException = false;
            try {
                boolean condition = false;

                while (condition == false) {
                    int number = scan.nextInt();
                    switch (number) {
                        case 1:
                            condition = true;
                            MathRunner.mathRun();
                            break;
                        case 2:
                            condition = true;
                            StringRunner.stringRun();
                            break;
                        case 3:
                            condition = true;
                            EmployeeRunner.runEmployee();
                            break;
                        case 0:
                            condition = true;
                            System.out.println("EXIT");
                            break;
                        default:
                            logger.error("Sorry, but you type incorrect number !!\nPlease, try again");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                isException = true;
                logger.error("You type incorrect number or character !!\nPlease, try again");
            } catch (NullPointerException e) {
                isException = true;
                logger.error("It is empty string!!\nPlease, try again");
        }
        } while (isException);
    }
}
