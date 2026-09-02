import java.util.Scanner;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
public class Arrays5 {
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
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);  // Sorting of Array
        System.out.println("Array after Sorting is : ");
        System.out.println(Arrays.toString(numbers));

        int max = Arrays.stream(numbers).max().orElse(0);
        System.out.println("Maximum in the Array is :" + max);
        int min = Arrays.stream(numbers).min().orElse(0);
        System.out.println("Minimum in the Array is :" + min);
        double avg = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Average of the Array is : " + avg);
        long count = Arrays.stream(numbers).count();
        System.out.println("Count of the array is : " + count);
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of the array is : ");

        System.out.println();
        System.out.println("Summary Statistics of the array is : ");
        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: "   + stats.getSum());
        System.out.println("Min: "   + stats.getMin());
        System.out.println("Max: "   + stats.getMax());
        System.out.println("Avg: "   + stats.getAverage());

        System.out.println();
        String[] words = {"Peach", "Apple", "Orange", "Banana"};
        System.out.println(Arrays.toString(words));

        System.out.println("Sorting of Strings : ");


        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        input.close();

    }

}
