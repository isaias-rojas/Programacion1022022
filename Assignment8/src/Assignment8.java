
public class Assignment8 {
    private final String inputSwapped;
    private String input;

    public Assignment8(String input){
        this.input = input;
        this.inputSwapped = swap(input);
    }

    private String swap(String input) {
        String newWord ="";
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++){
            newWord += swapWord(words[i]) + " ";
        }
        return newWord;

    }

    private String swapWord(String word) {

        if(word.length() == 1 || word.length() == 2 || word.length() == 3){
            return word;
        }
        int minus ;
        if(checkCharacter(word.charAt(word.length() - 1))){
            minus = 1;
        }else{
            minus = 2;
        }
        char[] newWord = word.substring(1, word.length() - minus).toCharArray();
        for(int i = 0; i < newWord.length; i++){
            int rand = (int) ((Math.random() * newWord.length));
            char temp = newWord[i];
            newWord[i] = newWord[rand];
            newWord[rand] = temp;
        }

        return word.charAt(0)+ String.valueOf(newWord) + word.substring(word.length() - minus);
    }

    private boolean checkCharacter(char charAt) {
        if((charAt >= 65  && charAt <=  90) || (charAt >= 97 && charAt <= 122)){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return this.inputSwapped;
    }

}
