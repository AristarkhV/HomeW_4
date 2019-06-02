package App;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {

        this.keywords = keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
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
