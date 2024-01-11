//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (isUnique("always")) {
            System.out.println("this is unqiue");
        } else {
            System.out.println("this is not unquie");
        }
    }


    public static boolean isUnique(String word) {

        for (int i = 0; i <= word.length(); i++) {
            char a = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == a) {

                    return true;
                }

            }


        }

                return false;

            }



    }





