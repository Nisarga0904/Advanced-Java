// Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
// function isNumeric()

package StringHandling.String_Functions;
import java.util.Scanner;
public class NumericChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        boolean result = isNumeric(input);
        if (result) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false; 
            }
        }
        return true; 
    }
}
