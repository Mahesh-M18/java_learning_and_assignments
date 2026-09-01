import java.util.Scanner;

public class Strings4 {
    static void main(String[] args) {
        String name = "Mahesh";
        name = name + "M"; // creates new String and makes name refer to the new String
        String Name = "Mahesh";
        Name = "Mahesh M"; // creates new String and makes Name refer to the new String
        System.out.println(name);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String _name = input.next(); // takes only one word we should use nextLine() for a sentence
        System.out.println(_name);
    }
}