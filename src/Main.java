/**
 * SDEV 301: Systems Programming
 *
 * @author Kendrick Hang, Tien Han
 * @version 1.0
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //Quick Test
        boolean result = isUnique("always");
        System.out.println(result);
        boolean result2 = isUnique("cat");
        System.out.println(result2);
    }

    //Another way to do this is to use indexOf("a") and lastIndexOf("a")
    //If they both return different indexes, then it is not unique
    //Another way to do this is the "inchworm" technique, where we look at a character
    //And search through the rest of the string to see if it repeats
    /**
     * isUnique checks if all characters in a given string are unique
     * @param word the given string to test
     * @return true if string is unique and false if not unique
     */
    public static boolean isUnique(String word) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            Character character = word.charAt(i);
            if (characters.contains(character)) {
                return false;
            } else {
                characters.add(character);
            }
        }
        return true;
    }
}