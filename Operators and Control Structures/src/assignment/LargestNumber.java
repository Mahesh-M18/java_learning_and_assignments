package assignment;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest;
        System.out.println(">>>Find the Largest Number<<<");
        System.out.print("Enter Number 1 : ");
        largest = input.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter Number " + i + " : ");
            int current = input.nextInt();
            if (largest < current) {
                largest = current;
            }
        }
        System.out.println("The Largest Number is : " + largest);

        input.close();
    }
}

