package JavaMethods;

public class Polyndrome {

    public static Boolean checkIsTheWordAPolindrom(String word)  {

        if (word == null || word == ""){
            return false;
        }
            char[] arr = word.toCharArray();
            int length = arr.length - 1;

            for (int k = 0; k <= Math.floor(length/2); k++) {
                if (arr[k] != arr[length-k]) {
                return false;
                }
        }
        return true;
    }
}



