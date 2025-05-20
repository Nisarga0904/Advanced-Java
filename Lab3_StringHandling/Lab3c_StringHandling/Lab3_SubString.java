// Q2. Write a Java Program for Counting how many times a substring appears in a main string
// using user defined function countOccurrences()

package StringHandling.String_Functions;import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();
        int count = countOccurrences(mainString, subString);

        System.out.println("The substring '" + subString + "' appears " + count + " time(s) in the main string.");

        scanner.close();
    }
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); 
        }

        return count;
    }
}


