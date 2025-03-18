package Training;
import java.util.Scanner;

public class SmallestVowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char smallestVowel = 'u';

        for (char ch : input.toCharArray()) {
            if (isVowel(ch) && ch < smallestVowel) {
                smallestVowel = ch;
            }
        }

        System.out.println(smallestVowel);
        scanner.close();
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}