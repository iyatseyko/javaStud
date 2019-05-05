package StudyProject.EmployeeCreation;

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
        System.out.println("In which order you want to sort employee data?\nYou can sort employee by id, name or birth date\nTo choose one of the variants, please, type 'id', 'name' or 'birth date'");

        boolean notError = false;
        while (notError == false) {
            String sortOrder = scan.nextLine();
            switch (sortOrder) {
                case "id":
                    notError = true;
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.ID));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.ID));

                    break;
                case "name":
                    notError = true;
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.NAME));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.NAME));

                    break;
                case "birth date":
                    notError = true;
                    Collections.sort(employee1, factoryComparator.createComparator(ComparatorFactory.EmployeeField.BIRTH_DATE));
                    Collections.sort(employee2, factoryComparator.createComparator(ComparatorFactory.EmployeeField.BIRTH_DATE));
                    break;
                case "0":
                    notError = true;
                    System.out.println("EXIT");
                    return;
                default:
                    logger.error("You type incorrect variant. Please, try again");
            }
            if (notError) {
                System.out.println("Employee from first file\n");
                for (Employee e : employee1) {
                    System.out.println(e);
                }
                System.out.println("Employee from second file\n");
                for (Employee e : employee2) {
                    System.out.println(e);
                }
            }
        }
        if (notError) {
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
