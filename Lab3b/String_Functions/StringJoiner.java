package Lab3b.String_Functions;
import java.util.Scanner;

public class StringJoiner {
    public static String joinStrings(String[] words, String delimiter) {
        if (words == null || words.length == 0) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1) result.append(delimiter);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the list of words in format :");
        String inputLine = sc.nextLine();
        
        System.out.println("Enter the delimiter:");
        String delimiter = sc.nextLine();
        
        // Remove square brackets and quotes, then split by comma
        inputLine = inputLine.replaceAll("\\[|\\]|\"", "");
        String[] words = inputLine.split(",");
        // Trim whitespace from each word
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
        }
        
        String joined = joinStrings(words, delimiter);
        System.out.println("Joined string: " + joined);
        
        sc.close();
    }
}
