package JavaMethods;

import java.util.Scanner;

public class RunnerClass {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the arrays length");
        int i = scan.nextInt();

        int [] integers = new int[i];

        for (int k = 0; k < integers.length; k++) {
            System.out.println("Enter " + (k+1) + " number");
            integers[k] = scan.nextInt();
        }

        for (int number : integers) {
            System.out.print(number + " ");
        }

        System.out.println("Enter 1 to choose min operation, 2 for max or 3 for average");

        int operation = scan.nextInt();

        switch (operation)
        {
            case 1:
                MathOperation.min(integers);
                break;
            case 2:
                MathOperation.max(integers);
                break;
            case 3:
                System.out.println(MathOperation.average(integers));
                break;
            default:
                System.out.println("The other operation was chosen");
                break;
        }
    }
}
