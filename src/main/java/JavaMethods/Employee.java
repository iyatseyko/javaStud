package JavaMethods;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    String firstName;
    String lastName;
    Date birthDate; // useDate
    int id;

    public Employee(String firstName, String lastName, Date birthDate, int id) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee [name= " + firstName + lastName + birthDate.toString() +" ]";
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

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        Date birthDate = null;
        try {
            birthDate = df.parse(employeeData[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Employee(firstName, lastName, birthDate, id);
    }
}