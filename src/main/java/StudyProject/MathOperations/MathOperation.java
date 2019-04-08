package StudyProject.MathOperations;

public class MathOperation {

    public static int min (int [] integers) {

        int minValue = integers[0];

        for (int i = 1; i < integers.length; i++) {
            if (minValue > integers[i]) {
                minValue = integers[i];
            }
        }
        return minValue;
    }

    public static int max (int [] integers) {
        int maxValue = integers[0];

        for (int i = 1; i < integers.length; i++) {
            if (maxValue < integers[i]) {
                maxValue = integers[i];
            }
        }
        return maxValue;
    }

    public static double average (int [] integers) {
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        return (double) sum / integers.length;
    }
}
