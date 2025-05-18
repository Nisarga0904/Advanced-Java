package Lab3b.String_Functions;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.println("Input: " + str1);
        System.out.println("Output: " + isPalindrome(str1));

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();
        System.out.println("Input: " + str2);
        System.out.println("Output: " + isPalindrome(str2));

        input.close();
    }
}


