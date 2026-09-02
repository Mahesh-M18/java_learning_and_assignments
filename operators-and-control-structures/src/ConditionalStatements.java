import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age : ");
        age = input.nextInt();
        if (age>=18) {
            System.out.println("You're an Adult");
        }
        else if (age==17) {
            System.out.println("You'll become an Adult in an Year");
        }
        else {
            System.out.println("You're a Minor");
        }

        input.close();
    }
}
/*
Nested if
if (){
    if(){

    }
    else{

    }
}
else{

}
*/
