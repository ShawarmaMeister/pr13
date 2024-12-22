import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        return isPalindromeHelper(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeHelper(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(word, left + 1, right - 1);
    }
}