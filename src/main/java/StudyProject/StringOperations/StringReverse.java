package StudyProject.StringOperations;

public class StringReverse {

    public static String stringReverse (String inputString) {

        if (inputString == null || inputString == "") {
            return "";
        }
        int length = inputString.length();
        String reverseString = "";

        for (int i=length-1; i>=0; i--) {
            char letter = inputString.charAt(i);
            reverseString+=letter;
        }
        return reverseString;
    }
}
