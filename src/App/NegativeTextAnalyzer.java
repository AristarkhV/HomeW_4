package App;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = {":(", "=(", ":|"};

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String getKeywords() {
        StringBuilder bufferKeywords = new StringBuilder();
        for (String i : keywords) {
            bufferKeywords.append(i)
                    .append(" ");
        }
        return bufferKeywords.toString();
    }
}
