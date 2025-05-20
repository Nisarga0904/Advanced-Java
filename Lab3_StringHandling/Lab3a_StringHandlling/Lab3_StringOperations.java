// 3a.Develop a java program for performing various string operations with different string
// handling functions directed as follows:
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
// String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
// startsWith() and endsWith()

package StringHandling.String_Functions;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "AIET";
        String str2 = new String("Welcome");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "AIET";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String text = "Welcome to AIET college";
        System.out.println("Index of 'AIET': " + text.indexOf("AIET"));
        System.out.println("Contains 'college'? " + text.contains("college"));

        // 5. Substring Operations
        System.out.println("Substring of text (11 to 15): " + text.substring(11, 15));

        // 6. String Modification
        String modified = text.replace("college", "institute");
        System.out.println("Modified text: " + modified);

        // 7. Whitespace Handling
        String messy = "   Hello AIET!   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concatenated);

        // 9. String Splitting
        String fruits = "Apple,Orange,Mango,Banana";
        String[] fruitArray = fruits.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" is the best");
        sb.insert(5, "College ");
        sb.replace(5, 12, "Institution");
        System.out.println("StringBuilder Output: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("user");

        System.out.println("Email contains '@'? " + email.contains("@"));
        System.out.println("Email starts with 'user'? " + email.startsWith("user"));
        System.out.println("Email ends with '.com'? " + email.endsWith(".com"));
        System.out.println("Is the email valid? " + isValid);

        sc.close();
    }
}

