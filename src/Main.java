import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        boolean unique = isUnique(word);
        System.out.println("The word has unique characters: " + unique);
    }

    public static boolean isUnique(String s){

        Set<Character> map = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.add(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}