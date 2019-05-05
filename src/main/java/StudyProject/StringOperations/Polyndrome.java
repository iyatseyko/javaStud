package StudyProject.StringOperations;

public class Polyndrome {

    public static Boolean checkIsTheWordAPolindrom(String word)  {

        if (word.equals(null)|| word.equals("")){
            throw new NullPointerException("inputString cannot be null");
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



