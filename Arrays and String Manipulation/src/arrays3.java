import java.util.Arrays;
import java.util.OptionalInt;

public class arrays3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum in the array : " + max);
        System.out.println("Mininum in the array : " + min);

        System.out.println();

        System.out.println("Another Method");
        OptionalInt maxi, mini;
        maxi = Arrays.stream(numbers).max();
        mini = Arrays.stream(numbers).min();
        System.out.println(maxi.getAsInt());
        System.out.println(mini.getAsInt());

        System.out.println();

        System.out.println("Another Method");

        // No OptionalInt variable needed!
        int maximum = Arrays.stream(numbers).max().orElse(0);
        int minimum = Arrays.stream(numbers).min().orElse(0);

        System.out.println(maximum);
        System.out.println(minimum);

    }
}
