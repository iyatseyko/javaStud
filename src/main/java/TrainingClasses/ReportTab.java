package TrainingClasses;

public class ReportTab {

    public char convertGrades(int testResult) {

        char grade;

        if (testResult >= 90){
            grade = 'A'  ;
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        return grade;
    }
}
