import java.util.Arrays;
public class arrays2 {
    public static void main(String[] args) {

        int[] marks = new int[5];

        System.out.println(marks);
        System.out.println(Arrays.toString(marks));

        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;

        System.out.println(marks);
        System.out.println(Arrays.toString(marks)); // to print one dimension array and
        // Arrays.deepToString(matrix) for multidimension array

        marks[2]=100;
        System.out.println(Arrays.toString(marks));

        System.out.println(marks.length);

        int sum = 0;
        for (int num:marks){
            sum+=num;
        }
        System.out.println("Sum of the array : " + sum);

        System.out.println(Arrays.stream(marks).sum()); //inbuilt method to find sum of the array
    }
}
