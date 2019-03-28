package JavaMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;

public class Employee {

    String firstName;
    String lastName;
    String birthDate;
    int id;

    public Employee(String firstName, String lastName, String birthDate, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(int price) {
        this.firstName = firstName;
    }

    public void setLastName(int price) {
        this.lastName = lastName;
    }

    public void setBirthDate(int price) {
        this.lastName = lastName;
    }

    public void setId(int price) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [name= " + firstName + lastName + " ]";
    }


    //private static List<Employee> readEmployeeDataFromCSV(String fileName) {
    //    List<Employee> employees = new ArrayList<Employee>();

    //    String filePath = "/Users/irayatseyko/IdeaProjects/JavaStudyProject/src/main/resources/employee.csv";



}