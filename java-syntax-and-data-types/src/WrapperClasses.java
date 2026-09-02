public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Wrapper Class Understandings");
    }
}

/*
Every primitive data type has a corresponding wrapper class.

In Java, wrapper classes provide a mechanism to wrap primitive data types (int, char, etc.)
into their corresponding object representations (Integer, Character, etc.).
They act as a bridge between Java’s highly efficient primitive data types and its strictly object-oriented frameworks.

Wrapper classes exist because some java features works with objects, not primitives.
Example - ArrayList<Integer> numbers = new ArrayList<>(); //right way
          ArrayList<int> numbers // wrong way as primitive type is written rather than its object
 */

/*
Primitive Type    Wrapper Class
byte               Byte
short              Short
int                Integer
long               Long
float              Float
double             Double
char               Character
boolean            Boolean
 */

/*
Autoboxing
Primitive -> Wrapper
int a=10;
Integer b=a;
Java automatically converts: int -> Integer
 */

/*
Unboxing
Wrapper -> Primitive
Integer a=10;
int b=a;
Java automatically converts: Integer -> int
 */