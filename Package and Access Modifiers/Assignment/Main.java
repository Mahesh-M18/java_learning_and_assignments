import utility.MathUtils;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>CALCULATOR<<<");
        System.out.print("Enter Number 1 : ");
        double a = input.nextDouble();
        System.out.print("Enter Number 2 : ");
        double b = input.nextDouble();

        MathUtils op = new MathUtils();

        System.out.println("Addition : " + op.add(a, b));
        System.out.println("Subtraction : " + op.sub(a, b));
        System.out.println("Multiplication : " + op.mul(a, b));
        System.out.println("Division : " + op.div(a, b));

        input.close();
    }
}
