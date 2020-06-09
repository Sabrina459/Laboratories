public class Text {
    private Sentense[] linesList;

    public Text(String someText) {

        linesList = splitToLines(someText);
    }

    private Sentense[] splitToLines(String someText) {

        String pattern = "(?<=[(\\?|\\.|!)])";
        String[] strArray = someText.split(pattern);

        Sentense[] sentenses = new Sentense[strArray.length];
        for (int i=0; i < strArray.length;i++) {
            sentenses[i] = new Sentense(strArray[i]);
        }
        return sentenses;
    }

    public void filterText(){
        for(Sentense sentense : linesList){
            sentense.filterSentenses();
        }
    }

    @Override
    public String toString() {
        String output = linesList[0].toString();
        for (int i = 1; i < linesList.length; i++){
            output += " " + linesList[i];
        }
        return output;
    }

}
