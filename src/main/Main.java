//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    package org.example;

import java.util.HashMap;

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
        }
        public static Boolean isUnique(String input) {
            if (!input.isEmpty()) {
                input = input.toLowerCase();
                HashMap<Character, Integer> uniqueCharacters = new HashMap<>();
                for (int i = 0; i < input.length(); i++) {
                    if (uniqueCharacters.containsKey(input.charAt(i))) {
                        System.out.println(input.charAt(i));
                        return false;
                    } else {
                        uniqueCharacters.put(input.charAt(i), 1);
                    }
                }
            }
        }
}