package StudyProject.EmployeeCreation;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Employee> createComparator (String comparatorType) {

        if(comparatorType == null){
            return null;
        }
        if(comparatorType.equalsIgnoreCase("id")){
            return new EmployeeComparatorById();

        } else if(comparatorType.equalsIgnoreCase("Name")){
            return new EmployeeComparatorByName();

        } else if(comparatorType.equalsIgnoreCase("BirthDate")){
            return new EmployeeComparatorByBirthDate();
        }

        return null;
    }
}
