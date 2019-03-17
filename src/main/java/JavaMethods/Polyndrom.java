package JavaMethods;

public class Polyndrom {

    public static Boolean checkIsTheWordAPolindrom(String word) {

        char[] arr = word.toCharArray();

        int length = arr.length - 1;
        boolean polindrom = true;

        for (int k = 0; k <= Math.floor(length/2); k++) {
                    if (arr[k] != arr[length-k]) {
                        polindrom = false;
                        break;
                    }
        }
        return polindrom;
    }
}



