public class Methods {
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }
    public static void main(String[] args) {
        int result = add(10,5); //calling a method
        System.out.println(result);
    }
}
/*
a method is a block of code that performs a particular task

static void method_name(parameters) - a method which returns nothing
static return_type method_name(parameters) - method which returns a value (return_type - int,double,boolean,etc)

static - can be called from main without creating an object
 */

/*
parameter - variable defined in method declaration.
argument - actual value passed when calling the method.
 */