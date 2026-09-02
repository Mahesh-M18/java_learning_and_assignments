package packageandmodifiers; // I(current_file) belong to the main package
import calculator.Calculator; // import package.classname
public class PublicAccessModifier {
    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println(Calculator.add(a,b));
        // without importing we can write System.out.println(calculator.Calculator.add(a,b));
        System.out.println(calculator.Calculator.add(a,b));
        Calculator cal = new Calculator();
        System.out.println(cal.add(a,b));
    }
}

/*
| Modifier    | Same Class | Same Package | Subclass Different Package | Other Different Package |
| ----------- | ---------: | -----------: | -------------------------: | ----------------------: |
| `private`   |          ✅ |            ❌ |                          ❌ |                       ❌ |
| default     |          ✅ |            ✅ |                          ❌ |                       ❌ |
| `protected` |          ✅ |            ✅ |                          ✅ |                       ❌ |
| `public`    |          ✅ |            ✅ |                          ✅ |                       ✅ |

 */