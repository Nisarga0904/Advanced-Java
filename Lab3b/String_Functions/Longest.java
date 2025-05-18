package Lab3b.String_Functions;
import java.util.Scanner;
public class Longest {
    public static String longestUniqueSubstring(String s) {
        int maxLen = 0;
        int start = 0;        
        int maxStart = 0;      
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = i;  
            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                maxStart = start;
            }
        }
        StringBuilder longest = new StringBuilder();
        for (int i = maxStart; i < maxStart + maxLen; i++) {
            longest.append(s.charAt(i));
        }

        return longest.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring is: " + result);

        sc.close();
    }
}

