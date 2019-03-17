package JavaMethods;

import com.sun.tools.javac.util.JavacMessages;

public class Polyndrom {

    public static Boolean checkIsTheWordAPolindrom(String word)  {

        try {
            char[] arr = word.toCharArray();
            int length = arr.length - 1;

            for (int k = 0; k <= Math.floor(length/2); k++) {
                if (arr[k] != arr[length-k]) {
                return false;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return true;
    }
}



