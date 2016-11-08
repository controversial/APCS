public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String out = "";
        for (int i=0; i<guess.length(); i++) {
            if (guess.charAt(i) == this.word.charAt(i)) {
                out += guess.substring(i, i+1);
            } else if (this.word.contains(guess.substring(i, i+1))) {
                out += "+";
            } else {
                out += "*";
            }
        }
        return out;
    }
}