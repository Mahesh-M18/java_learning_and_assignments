import java.util.Arrays;

public class arrays7 {
    public static void main(String[] args) {
        int[] marks = {97,98,95};
        int[][] finalMarks = {{97,98,95},{95,95,98}};

        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(finalMarks));
        System.out.println(Arrays.toString(finalMarks[0]));
        System.out.println(Arrays.toString(finalMarks[1]));
        System.out.println(finalMarks[0][0]);//first student's first marks



    }
}
