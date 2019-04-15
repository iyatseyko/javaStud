package StudyProject;

import StudyProject.EmployeeCreation.Employee;
import StudyProject.EmployeeCreation.EmployeeComparator;
import StudyProject.EmployeeCreation.TakeUniqueAndDuplicateEmployee;
import StudyProject.MathOperations.MathOperation;
import StudyProject.StringOperations.Polyndrome;
import StudyProject.StringOperations.StringReverse;
import com.oracle.tools.packager.Log;

import java.util.*;

import static StudyProject.EmployeeCreation.ReadAndCreateEmployeeFromCSV.readEmployeeDataFromCSV;

public class RunnerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to use math operations - please, type 1; \nIf you want Polyndrome or StringReverse methods - type 2;\nIf you want read employee info from CSV file - type 3");
        try {
            boolean condition = false;

            while (condition == false) {
                int number = scan.nextInt();
                if (number == 1) {
                    condition = true;
                    int[] integers = null;
                    System.out.println("You choose math operations with numbers. Now, type array of numbers.\nFor the array you should define a length at first. Please, type the array's length");
                    integers = new int[scan.nextInt()];
                    System.out.println("Lenth of your array is ".concat(Integer.toString(integers.length)));
                    for (int counter = 0; counter < integers.length; counter++) {
                        System.out.println("Please, enter ".concat(Integer.toString(counter + 1)).concat(" number of array"));
                        integers[counter] = scan.nextInt();
                    }
                    System.out.print("Your array is ".concat(Arrays.toString(integers)));

                    System.out.println("Enter 1 to choose min operation, 2 for max, 3 for average");

                    boolean operationNumber = false;
                    while (operationNumber == false) {
                        int operation = scan.nextInt();

                        switch (operation) {
                            case 1:
                                System.out.println(MathOperation.min(integers));
                                operationNumber = true;
                                break;
                            case 2:
                                System.out.println(MathOperation.max(integers));
                                operationNumber = true;
                                break;
                            case 3:
                                System.out.println(MathOperation.average(integers));
                                operationNumber = true;
                                break;
                            default:
                                System.out.println("Sorry, but you type incorrect number !!\nPlease, try again");
                                break;
                        }
                    }

                } else if (number == 2) {
                    condition = true;
                    System.out.println("Please, type a string value");
                    scan.nextLine();
                    String inputSting = scan.nextLine();

                    System.out.println("Enter 1 to choose Polindrome, 2 for StringReverse");
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
                } else if (number == 3){
                    condition = true;
                    System.out.println("You choose to read employee info from CSV file\n");
                    System.out.println("Please, type a name of the file from which you want to read employee's data");
                    String basePath = "/home/irynayatseiko/IdeaProjects/javaStudy/src/main/resources/";
                    scan.nextLine();
                    String pathName = basePath.concat(scan.nextLine());
                    List<Employee> employee1 = readEmployeeDataFromCSV(pathName);
                    Collections.sort(employee1, new EmployeeComparator());
                    for (Employee e : employee1)
                    { System.out.println(e); }

                    pathName = basePath.concat(scan.nextLine());
                    List<Employee> employee2 = readEmployeeDataFromCSV(pathName);
                    Collections.sort(employee2, new EmployeeComparator());
                    for (Employee e : employee2)
                    { System.out.println(e); }

                    List<Employee> uniqueEmployee = TakeUniqueAndDuplicateEmployee.takeUniqueEmployee(employee1, employee2);

                    for (Employee e : uniqueEmployee)
                    { System.out.println(e); }
                } else {
                    System.out.println("Sorry, but you type incorrect number !!\nPlease, try again");
                }
            }
        } catch (InputMismatchException e) {
            Log.info("You type incorrect number or character !!\nPlease, try again");
        }
    }
}
