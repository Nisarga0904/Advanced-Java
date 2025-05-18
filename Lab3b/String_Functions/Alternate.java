package Lab3b.String_Functions;
import java.util.Scanner;
public class Alternate {
    public static String alternateConcat(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }
        if (len1 > len2) {
            result.append(s1.substring(minLen));
        } else if (len2 > len1) {
            result.append(s2.substring(minLen));
        }
        
        return result.toString();
    }
    
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String input2 = sc.nextLine();

        String result = alternateConcat(input1, input2);
        System.out.println("Concatenated result: " + result);

        sc.close();
    }
}