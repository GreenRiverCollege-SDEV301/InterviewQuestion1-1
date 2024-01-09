//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        if (isUnique("alwgys")) {
            System.out.print("The word is unique");
        } else {
            System.out.print("The word is not unique!");
        }
    }

    public static boolean isUnique(String word) {
        for (int i = 0; i <= word.length()-1; i++) {
            char a = word.charAt(i);
            for(int j = i + 1 ; j <= word.length()-1; j++) {
                if (word.charAt(j) == a) {
                    return false;
                }
            }

        }
        return true;
    }

}