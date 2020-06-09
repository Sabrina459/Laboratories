public class Letter {
    private Character letter;

    public Letter(char letter){

        this.letter = letter;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Letter letter1 = (Letter) o;
        boolean result = Character.toLowerCase(letter) == Character.toLowerCase(letter1.letter);
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}
