package StudyProject.EmployeeCreation;

import StudyProject.RunnerClass;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static StudyProject.EmployeeCreation.ReadAndCreateEmployeeFromCSV.readEmployeeDataFromCSV;

public class EmployeeRunner {
    static Logger logger = Logger.getLogger(EmployeeRunner.class);

    public static void runEmployee() {

        ComparatorFactory factoryComparator = new ComparatorFactory();
        Scanner scan = new Scanner(System.in);

        System.out.println("You choose to read employee info from CSV files\n");
        List<Employee> employee1 = readEmployeeDataFromCSV("employee");
        List<Employee> employee2 = readEmployeeDataFromCSV("employee2");

        boolean notError = true;
        while (notError) {
            System.out.println("\n\nIn which order you want to sort employee data?\nYou can sort employee by id, name or birth date\nTo choose one of the variants, please, type 'id', 'name' or 'birth date'");
            String sortOrder = scan.nextLine();
            switch (sortOrder) {
                case "id":
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.ID));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.ID));
                    break;
                case "name":
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.NAME));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.NAME));
                    break;
                case "birth date":
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.BIRTH_DATE));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.BIRTH_DATE));
                    break;
                case "0":
                    System.out.println("EXIT");
                    return;
                case "4":
                    notError = false;
                    System.out.println("YOU COME BACK TO PREVIOUS STEP");
                    RunnerClass.goBack();
                    break;
                default:
                    logger.error("You type incorrect variant. Please, try again");
            }

            if (notError == true) {
                System.out.println("Employee from first file\n");
                for (Employee e : employee1) {
                    System.out.println(e);
                }
                System.out.println("Employee from second file\n");
                for (Employee e : employee2) {
                    System.out.println(e);
                }

                List<Employee> uniqueEmployee = TakeUniqueAndDuplicateEmployee.takeUniqueEmployee(employee1, employee2);
                System.out.println("\nThis is uniqueEmployee list\n");
                for (Employee e : uniqueEmployee) {
                    System.out.println(e);
                }
                List<Employee> duplicateList = TakeUniqueAndDuplicateEmployee.takeDuplicateEmployee(employee1, employee2);
                System.out.println("\nThis is duplicateEmployee list\n");
                for (Employee e : duplicateList) {
                    System.out.println(e);
                }
            }
        }
    }
}
