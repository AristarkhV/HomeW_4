package App;

public class AsciiCharSequence implements CharSequence {
    byte[] inputArray;

    public AsciiCharSequence(byte[] inputArray) {
        this.inputArray = inputArray;
    }

    public int length() {
        return inputArray.length;
    }

    public char charAt(int index) {
        return (char) inputArray[index];
    }

    @Override
    public CharSequence subSequence(int startIndex, int endIndex) {
        byte[] subSequence = new byte[endIndex - startIndex];
        if (startIndex < endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                subSequence[i - startIndex] = inputArray[i];
            }
            return new AsciiCharSequence(subSequence);
        } else {
            return new AsciiCharSequence(null);
        }
    }

    @Override
    public String toString() {
        return new String(this.inputArray);
    }
}
