package Lab3b.String_Functions;
import java.util.Scanner;
public class Reverse {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            result.append(sb.reverse()); 
            
            if (i < words.length - 1) {
                result.append(" "); 
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = reverseEachWord(input);
        System.out.println("Reversed words sentence: " + output);

        sc.close();
    }
}

