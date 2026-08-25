import java.util.Scanner;

public class vowels_and_consonants {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = input.nextLine();

        sentence = sentence.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonats : " + consonants);
        input.close();
    }
}
