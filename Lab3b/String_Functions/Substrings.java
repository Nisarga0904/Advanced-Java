package Lab3b.String_Functions;
import java.util.ArrayList;
import java.util.Scanner;

public class Substrings {

    public static ArrayList<String> generateSubstrings(String s) {
        ArrayList<String> substrings = new ArrayList<>();
        int n = s.length();

        for (int start = 0; start < n; start++) {
            StringBuilder sb = new StringBuilder();
            for (int end = start; end < n; end++) {
                sb.append(s.charAt(end));
                substrings.add(sb.toString());
            }
        }

        return substrings;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        ArrayList<String> result = generateSubstrings(input);

        // Print like array format
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print("\"" + result.get(i) + "\"");
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
