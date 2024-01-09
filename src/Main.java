import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        boolean result1 = isUnique("");
        System.out.println(result1);

        boolean result2 = isUnique("apple");
        System.out.println(result2);

        boolean result3 = isUnique("thomas");
        System.out.println(result3);
    }

    /* method that accepts a String and returns whether the word has all unique characters
       @param String word String that is checked for uniquness
       @return boolean whether the String is unique
    */
    public static boolean isUnique(String word){

        if (word.isEmpty()){
            return false;
        }else{
            HashMap wordChars = new HashMap<>();
            for(int i =0; i < word.length(); i++){
                if(wordChars.containsKey(word.charAt(i))){
                    return false;
                }else{
                    wordChars.put(word.charAt(i), 1);
                }
            }
            return true;
        }
    }
}