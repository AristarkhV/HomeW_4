package App;

public class Main {

    public static void main(String[] args) {

        Palindrome newString = new Palindrome();
        System.out.println(newString.isPalindrome("Madam, I'm Ad"));

        Factorial number = new Factorial();
        System.out.println(number.factorial(3));
    }
}
