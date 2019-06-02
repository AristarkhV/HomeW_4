package App;

public class Main {

    public static void main(String[] args) {

        Palindrome newString = new Palindrome();
        System.out.println(newString.isPalindrome("Madam, I'm Adam"));

        Factorial number = new Factorial();
        System.out.println(number.factorial(3));

        String[] spamKeywords = {"spam", "sale"};
        TextAnalyzer tempSpamAnalysis = new SpamAnalyzer(spamKeywords);
        TextAnalyzer tempNegativeTextAnalysis = new NegativeTextAnalyzer();
        TextAnalyzer tempTooLongTextAnalysis = new TooLongTextAnalyzer(50);
        TextAnalyzer[] analyzers = {tempTooLongTextAnalysis, tempSpamAnalysis, tempNegativeTextAnalysis};
        String text = "Lorem ipsum dolor sit :(";
        System.out.println(checkLabels(analyzers, text));

        SqrtOverride sqrtNumber = new SqrtOverride();
        try {
            System.out.println(sqrtNumber.sqrt(-144.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//output: Hello!
        System.out.println("Размер её - " + answer.length());//output: 6
        System.out.println("Символ под № 0 - " + answer.charAt(0));//output: e
        System.out.println("Подпоследовательность - " + answer.subSequence(0, 5));//output: ello
        System.out.println(answer.toString());//output: Hello!
        
        PlaneBuilder plane = new PlaneBuilder().addEngineNumber(6)
                .addFuselage("Mria")
                .addType("An-225")
                .addWing("High");
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for (TextAnalyzer i : analyzers) {
            if (i.processText(text) != Label.OK) {
                return i.processText(text);
            }
        }
        return Label.OK;
    }
}
