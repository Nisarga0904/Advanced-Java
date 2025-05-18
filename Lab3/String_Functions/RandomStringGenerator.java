import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Random String: " + randomString);

        scanner.close();
    }
}
