import java.util.ArrayList;
public class Word extends Element{
    private ArrayList<Letter> letters;

    public Word(String someWord) {
        letters = splitToLetters(someWord);
    }

    private ArrayList<Letter> splitToLetters(String someWord) {
        ArrayList<Letter> letters = new ArrayList<>();
        char letter;
        for (int i = 0; i < someWord.length(); i++){
            letter = someWord.charAt(i);
            letters.add(new Letter(letter));
        }
        return letters;
    }

    public void filterLetters() {
        Letter firstLetter = letters.get(0);
        for (int i = 1; i < letters.size()-1;) {
            if(firstLetter.equals(letters.get(i))){
                letters.remove(i);
            }else{
                i++;
            }
        }

    }

    @Override
    public String toString() {
        String output = "";
        for (Letter l: letters){
            output += l;
        }
        return output;
    }
}
