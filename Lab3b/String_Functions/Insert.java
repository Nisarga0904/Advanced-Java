package Lab3b.String_Functions;
import java.util.Scanner;
public class Insert {
    public static String insertSpaceAfterNChars(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = n; i < sb.length(); i += n + 1) {
            sb.insert(i, ' ');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        String result = insertSpaceAfterNChars(input, n);
        System.out.println("Result: " + result);

        sc.close();
    }
}

