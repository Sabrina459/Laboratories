import java.util.ArrayList;
public class Sentense {
    private ArrayList<Element> wordList;

    public Sentense(String someLine) {
        wordList = splitToWords(someLine);
    }

    private ArrayList<Element> splitToWords(String someLine) {
        String[] splitLine = someLine.split(" ");
        ArrayList<Element> resultWordList = new ArrayList<>();
        String tempWord;
        String lastLetter;
        String filteredWord;
        for (int i = 0; i < splitLine.length; i++){
            tempWord = splitLine[i];
            if(tempWord.length() < 1){
                continue;
            }
            lastLetter = tempWord.substring(tempWord.length()-1);

            if(tempWord.length() > 1 && ",;:.!?".contains(lastLetter)){

                filteredWord = tempWord.substring(0, tempWord.length()-1);
                resultWordList.add(new Word(filteredWord));
                resultWordList.add(new Punctuation(lastLetter));
            }else{
                resultWordList.add(new Word(tempWord));
            }

        }
        return resultWordList;
    }

    public void filterSentenses(){
        for(Element word: wordList){
            if(word instanceof Word){
                ((Word) word).filterLetters();
            }
        }
    }

    @Override
    public String toString() {
        String output = wordList.get(0).toString();
        for(int i = 1; i < wordList.size(); i++){
            if(wordList.get(i) instanceof Word){
                output += " ";
            }
            output += wordList.get(i).toString();
        }
        return output;
    }
}
