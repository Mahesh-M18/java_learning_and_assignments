import java.util.Scanner;
public class simple_calculator_assignment {
    static double add(double a,double b){
        return (a+b);
    }
    static double sub(double a,double b){
        return (a-b);
    }
    static double mul(double a,double b){
        return (a*b);
    }
    static double div(double a,double b){
        return (a/b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>CALCULATOR<<<");
        System.out.print("Enter Number 1 : ");
        double a = input.nextDouble();
        System.out.print("Enter Number 2 : ");
        double b = input.nextDouble();

        System.out.println("Addition : " + add(a, b));
        System.out.println("Subtraction : " + sub(a, b));
        System.out.println("Multiplication : " + mul(a, b));
        System.out.println("Division : " + div(a, b));

        input.close();
    }
}
