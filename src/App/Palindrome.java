package App;

public class Palindrome {
    public static boolean isPalindrome(String currentString) {
        currentString = currentString.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reversText = new StringBuilder(currentString).reverse();
        return (reversText.toString().equalsIgnoreCase(currentString));
    }
}
