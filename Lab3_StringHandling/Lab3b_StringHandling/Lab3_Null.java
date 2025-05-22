// 3b. String Exercise progams
// Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
// defined function isNullOrEmpty().
package StringHandling.String_Functions;
import java.util.Scanner;
public class Lab3_Null {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is valid and not just whitespace.");
        }

        scanner.close();
    }
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
