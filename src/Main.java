import java.util.Hashtable;

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
        System.out.println("Is 'string' a unique word: "+isUnique("string")); //prints true
        System.out.println("Is 'unique' a unique word: " + (isUnique("unique"))); //prints false
    }
    public static boolean isUnique(String word) throws StringIndexOutOfBoundsException
    {
        return isUnique(word, 0);
    }
    private static boolean isUnique(String word, int index) throws StringIndexOutOfBoundsException
    {
        char letter = word.charAt(index);
        for (int i = 0; i < word.length(); i++)
        {
            if (letter == word.charAt(i) && i != index)
            {
                return false;
            }
        }
        if (letter == word.charAt(word.length()-1))
        {
            return isUnique(word, index+1);
        }
        return true;
    }
}