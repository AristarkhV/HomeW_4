package App;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract Label getLabel();

    protected abstract String[] getKeywords();

    @Override
    public Label processText(String text) {

        String[] keywords = this.getKeywords();
        for (String i : keywords) {
            if (text.contains(i)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
