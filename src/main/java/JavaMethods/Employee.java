package JavaMethods;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    String firstName;
    String lastName;
    String birthDate; // useDate
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


    public static List<Employee> readEmployeeDataFromCSV(String pathName) {
        List<Employee> employees = new ArrayList<Employee>();
        try {

        BufferedReader br = new BufferedReader(new FileReader(pathName));
        String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");
                Employee employee = createEmployee(attributes);
                employees.add(employee);
                line = br.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return employees;
    }

    private static Employee createEmployee(String[] employeeData) {

        int id = Integer.parseInt(employeeData[0]);
        String  firstName = employeeData[1];
        String lastName = employeeData[2];
        String birthDate = employeeData[3];

        return new Employee(firstName, lastName, birthDate, id);
    }
}