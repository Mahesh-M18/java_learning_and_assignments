package utility;

public class MathUtils {

    public static double add(double a, double b) {
        return (a + b);
    }

    public static double sub(double a, double b) {
        return (a - b);
    }

    public static double mul(double a, double b) {
        return (a * b);
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (a / b);
    }
}
