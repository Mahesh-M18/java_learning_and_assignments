public class type_casting {
    static void main(String[] args) {
        int a=10;
        double b=a; // widening casting
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + " " + b);

        double c=10.7;
        int d= (int)c; // decimal part is discarded, no roundoff done here
        System.out.println(c);
        System.out.println(d);
        System.out.println(c + " " + d);

        int e=10,f=3;
        System.out.println(e/f);

        double result = (double)e/f;
        System.out.println(result);
    }
}
/*
converting one data type into another.

Widening casting
Smaller type -> larger compatible type.

Narrowing casting
Larger type -> smaller type.
 */