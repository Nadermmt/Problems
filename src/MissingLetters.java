public class MissingLetters {
    public String GetMissingLetters(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = sentence.toLowerCase().toCharArray();
        for (char character : ch) {
            alphabets = alphabets.replace(String.valueOf(character), "");
        }
        return alphabets;
    }
}