// 2a.Develop a java program for performing various string operations with different string
// handling functions directed as follows
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String
// Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
// contains( ) and startsWith() and endsWith()
package String;
import java.util.Scanner;

public class Lab2a_StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // String Searching
        String searchIn = "Java programming is fun!";
        System.out.println("Index of 'programming': " + searchIn.indexOf("programming"));
        System.out.println("Contains 'fun'? " + searchIn.contains("fun"));

        // Substring Operations
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // String Modification
        String modified = str1.replace('l', 'x');
        System.out.println("Modified str1 (replace 'l' with 'x'): " + modified);

        // Whitespace Handling
        String messy = "   lots of space   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + concat);

        // String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Splitting colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is powerful");
        sb.insert(0, "Hey! ");
        sb.replace(4, 7, "Hello");
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        int age = 25;
        String name = "Alice";
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // Email Validation
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("user");
        System.out.println("Email contains '@'? " + email.contains("@"));
        System.out.println("Email starts with 'user'? " + email.startsWith("user"));
        System.out.println("Email ends with '.com'? " + email.endsWith(".com"));
        System.out.println("Is email valid? " + isValid);

        sc.close();
    }
}

