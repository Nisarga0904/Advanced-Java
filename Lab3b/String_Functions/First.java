package Lab3b.String_Functions;
import java.util.Scanner;
public class First {
    public static Character firstNonRepeatedChar(String s) {
        int[] counts = new int[256];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Character result = firstNonRepeatedChar(input);
        if (result == null) {
            System.out.println("null");
        } else {
            System.out.println("Non-repeated character: " + result);
        }

        sc.close();
    }
}

