public class method_overloading {
    static int add(int a,int b){
        int result = a+b;
        return result;
    }
    static int add(int a,int b,int c){
        int result = a+b+c;
        return result;
    }
    static double add(double a,double b){
        double result = a+b;
        return result;
    }
    static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10.2,15.3));
        System.out.println(add(10,20,30));
    }
}
/*
Method overloading occurs when multiple methods within the same class
share the exact same name but have different parameter lists.
The Java compiler determines which method to execute at compile time based
strictly on the arguments passed.

Methods must have different parameters (change in count, data type, or order).
 */