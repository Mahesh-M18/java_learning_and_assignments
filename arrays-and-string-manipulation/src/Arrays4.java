import java.util.Arrays;
import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        for (int i = 1; i <= numbers.length; i++) {
            System.out.print("Enter Number " + i + " : ");
            numbers[i - 1] = input.nextInt();
        }

        System.out.println();

        System.out.println("Entered Array is : ");
        for (int num : numbers) {
            System.out.println(num);

        }
        System.out.println(Arrays.toString(numbers));
        input.close();
    }

}
