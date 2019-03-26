package JavaMethods;

import java.util.Scanner;

public class RunnerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the arrays length");
        int i = scan.nextInt();

        int[] integers = new int[i];

        String s = "";
        for (int in : integers) {
            s += in;
        }
        ;

        for (int k = 0; k < integers.length; k++) {
            System.out.println("Enter " + (k + 1) + " number");
            integers[k] = scan.nextInt();
        }

        for (int number : integers) {
            System.out.print(number + " ");
        }

        System.out.println("Enter 1 to choose min operation, 2 for max, 3 for average, 4 for reverse, 5 for polyndrome");

        int operation = scan.nextInt();

        switch (operation) {
            case 1:
                MathOperation.min(integers);
                break;
            case 2:
                MathOperation.max(integers);
                break;
            case 3:
                System.out.println(MathOperation.average(integers));
                break;
            case 4:
                System.out.println(s);
                System.out.println(Polyndrome.checkIsTheWordAPolindrom(s));
                break;
            case 5:
                System.out.println(StringReverse.stringReverse(s));
                break;
            default:
                System.out.println("The other operation was chosen");
                break;
        }
    }
}
