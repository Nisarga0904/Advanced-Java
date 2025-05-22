// Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
// capitalizeWords()

package StringHandling.String_Functions;
import java.util.Scanner;
public class Lab3_CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String result = capitalizeWords(input);
        System.out.println("Capitalized: " + result);
        scanner.close();
    }
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.trim().split("\\s+"); 
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                capitalized.append(word.substring(1).toLowerCase()); 
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim(); 
    }
}
