import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);
        int userNumber;
        do {
            System.out.print("Guess my number : ");
            userNumber = input.nextInt();
            if (userNumber == myNumber) {
                System.out.println("Correct Guess");
                break;
            } else if (userNumber > myNumber)
                System.out.println("Number too large");
            else
                System.out.println("Number too small");
        } while (userNumber >= 0);

        System.out.println("My number was : " + myNumber);
    }
}

