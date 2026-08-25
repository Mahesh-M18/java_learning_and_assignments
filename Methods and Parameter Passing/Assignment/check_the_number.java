import java.util.Scanner;

public class check_the_number {
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse *= 10;
            reverse += digit;
            num /= 10;
        }
        return original == reverse;
    }

    static void main(String[] args) {
        System.out.println(">>>CHECK YOUR NUMBER<<<");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();

        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        if (isPalindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        input.close();
    }

}
