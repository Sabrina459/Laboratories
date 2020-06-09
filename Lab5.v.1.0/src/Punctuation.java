public class Punctuation extends Element{
    private String pChar;
    public Punctuation(String pChar) {
        super();
        this.pChar = pChar;

    }

    @Override
    public String toString() {
        return pChar;
    }
}
