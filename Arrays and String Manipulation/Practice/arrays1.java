public class arrays1 {
    public static void main(String[] args) {
        int[] marks = {85,90,78,92,88};
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Another Method");
        for (int number: marks){
            System.out.println(number);
        }

    }
}
