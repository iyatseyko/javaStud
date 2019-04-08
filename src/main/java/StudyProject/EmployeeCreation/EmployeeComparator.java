package StudyProject.EmployeeCreation;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.getLastName().compareTo(e2.getLastName());
        if (result != 0)
            return result;
        return e1.getFirstName().compareToIgnoreCase(e2.getLastName());
    }
}
