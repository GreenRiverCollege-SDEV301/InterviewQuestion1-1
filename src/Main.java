import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        //Quick Test
        boolean result = isUnique("always");
        System.out.println(result);
        boolean result2 = isUnique("cat");
        System.out.println(result2);
    }

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