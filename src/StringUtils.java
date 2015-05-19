/**
 * Created by Alyona on 19.05.2015.
 */
import java.util.Locale;
import java.util.Scanner;

public class StringUtils {

        public static void main (String[] args) {
            StringUtils Str = new StringUtils();
            String textDouble = "abc 15.9 ddd";
            Str.findNumbers(textDouble);

            String number1 = "FGhj256rtyu t100..ee";
            String number2 = "t100..ee";
            Str.div(number1, number2);

            String text = "Vertical Text In Word. Making text vertical in word isn’t easy if you don’t know where to look. "
                    + "There is no simple way of getting Word (word) to display vertically aligned text, but there is a sneaky way.";
            String word = "word";
            Str.findWord(text, word);
        }

        public int getIntFromStr(String str) {
            int n = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    while (Character.isDigit(str.charAt(i))) {
                        n = n * 10 + Character.getNumericValue(str.charAt(i));
                        i++;
                    }
                    return n;
                }
            }
            return n;
        }

        public void div (String number1, String number2) {
            int n1 = getIntFromStr(number1);
            int n2 = getIntFromStr(number2);
            int newNumber = n1 / n2;
            System.out.println(newNumber);
        }

        public void findWord (String text, String word) {
            String newText = text.replaceAll(word, "drow");
            char first = Character.toUpperCase(word.charAt(0));
            String wordUpper = first + word.substring(1);
            newText = newText.replaceAll(wordUpper, "Drow");
            System.out.println(newText +"\n");
        }

        public void findNumbers (String text) {
            Scanner sc = new Scanner(text);
            int i = 0;
            sc.useLocale(Locale.US);
            while (sc.hasNext()) {
                while (sc.hasNext() && !sc.hasNextDouble()) {
                    sc.next();
                }
                while(sc.hasNextDouble()) {
                    double d = sc.nextDouble();
                    i++;
                    System.out.println(d);
                }
            }
            if (i == 0) {
                System.out.println("Double wasn't find");
            }
            sc.close();
        }
}
