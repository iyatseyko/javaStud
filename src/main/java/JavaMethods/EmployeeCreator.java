package JavaMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static JavaMethods.Employee.readEmployeeDataFromCSV;

public class EmployeeCreator {


    public static void main(String... args) throws IOException {


        String pathName = "/home/irynayatseiko/IdeaProjects/javaStudy/src/main/resources/employee.csv";
        List<Employee> employee = readEmployeeDataFromCSV(pathName);

        for (Employee e : employee)
        { System.out.println(e); }

        String str = "aaaaaafra1n!#$%&*+/=^_`.~dbn!#$%&*+/=^_`.~dbn!#$%&*+/=^_`.~dbn!#$%&*+/=ee";
        System.out.println(str.length());

    }
}
