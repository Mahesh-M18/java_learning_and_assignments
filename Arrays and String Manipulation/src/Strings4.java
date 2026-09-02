import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args) {
        String name = "Mahesh";
        name = name + "M"; // creates new String and makes name refer to the new String
        String fullName = "Mahesh";
        fullName = "Mahesh M"; // creates new String and makes fullName refer to the new String
        System.out.println(name);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your College Name : ");
        String collegeName = input.next(); // takes only one word we should use nextLine() for a sentence
        System.out.println(collegeName);
    }
}