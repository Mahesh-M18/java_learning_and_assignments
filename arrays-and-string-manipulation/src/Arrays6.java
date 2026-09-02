import java.util.Arrays;
public class Arrays6 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(original));
        // Slice from index 1 to index 4 (elements at 1, 2, and 3)
        int[] slice = Arrays.copyOfRange(original, 1, 4);

        System.out.println(Arrays.toString(slice));
    }
}
