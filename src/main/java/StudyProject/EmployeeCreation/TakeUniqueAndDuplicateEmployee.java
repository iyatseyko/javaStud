package StudyProject.EmployeeCreation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeUniqueAndDuplicateEmployee{


    public static <E> List<E> takeUniqueEmployee(List<E> input1, List<E> input2) {
        return  Stream.concat(input1.stream(), input2.stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
