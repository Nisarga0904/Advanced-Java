// Q10. Write a Java Program for Counting the number of words in a string using user defined function
// countWords()

package StringHandling.String_Functions;
import java.util.Scanner;
public class Lab3_WordCounter {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        if (str.isEmpty()) {
            return 0;
        }
        return words.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}
