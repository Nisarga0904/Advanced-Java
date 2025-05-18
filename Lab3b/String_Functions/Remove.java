package Lab3b.String_Functions;
import java.util.Scanner;
public class Remove {
    public static String removeChar(String str, char ch) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.nextLine().charAt(0);

        String result = removeChar(input, ch);
        System.out.println("String after removal: " + result);

        sc.close();
    }
}
