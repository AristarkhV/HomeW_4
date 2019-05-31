package App;

public class Palindrome {
    public Palindrome() {
    }

    public static boolean isPalindrome(String currentString) {

        if (currentString == null) {
            return true;
        }
        StringBuilder bufferString = new StringBuilder();
        String reverceString = new String();
        String validator = "[^a-zA-Z0-9]";
        bufferString.append(currentString.replaceAll(validator, "").toLowerCase());
        currentString = bufferString.toString();
        reverceString = bufferString.reverse().toString();
        if (reverceString.equals(currentString)) {
            return true;
        }
        return  false;
    }
}
