// Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
// function removeWhitespace()


package StringHandling.String_Functions;
import java.util.Scanner;
public class Lab3_WhiteSpaceRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();
        String result = removeWhitespace(input);
        System.out.println("String without whitespace: " + result);
        scanner.close();
    }
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }   
        return str.replaceAll("\\s+", "");
    }
}
