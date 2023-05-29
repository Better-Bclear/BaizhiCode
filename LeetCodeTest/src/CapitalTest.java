public class CapitalTest {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)){
            return true;
        }
        if(word.toLowerCase().equals(word)){
            return true;
        }
        char[] chars = word.toLowerCase().toCharArray();
        chars[0] = (char)(chars[0]-32);
        String s = new String(chars);
        return s.equals(word);
    }
}
