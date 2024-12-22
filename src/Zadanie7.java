import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n > 1: ");
        int n = scanner.nextInt();

        System.out.print("Простые множители числа " + n + ": ");
        factorize(n);
    }

    public static void factorize(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}