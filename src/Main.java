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
        // quick test
        System.out.println("is the word 'water' unique? " + isUnique("water"));
        System.out.println("is the word 'never' unique? " + isUnique("never"));
    }

    public static boolean isUnique(String word) {
        ArrayList<Character> letters = new ArrayList<>();
        for (char letter : word.toCharArray()) {
            if(letters.contains(letter)){
                return false;
            }
            else {
                letters.add(letter);
            }
        }
        return true;
    }
}