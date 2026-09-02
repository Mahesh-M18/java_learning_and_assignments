package packageandmodifiers; // I(current_file) belong to the main package
import calculator.Calculator; // import package.classname
public class PackageLearning {
    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println(Calculator.add(a,b));
        // without importing we can write System.out.println(calculator.Calculator.add(a,b));
    }
}


//import package.* - imports all the classes belonging to the package
// Java automatically imports java.lang.*

/*
the order is

package
   ↓
import
   ↓
class
   ↓
methods
   ↓
statements

 */