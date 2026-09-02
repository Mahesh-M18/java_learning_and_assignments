package packageandmodifiers;

public class AccessModifiers {
    public static void main(String[] args) {

    }
}

/*
Four access levels are:

public - anyone can enter - Anyone can access it, as long as the class/member itself is accessible.

protected - your neighborhood + nearby relatives - within the same package and from subclasses in another package

default - only people in your neighborhood - accessible only within the same package

private - only you - Only the same class can access it
private variable
      ↓
cannot access directly
      ↓
public getter/setter
      ↓
controlled access
 */


/*
`static` means a variable or method belongs to the **class itself**, not to individual objects.
A `static` member can be accessed using the class name, e.g. `Student.college` or `Calculator.add()`, without creating an object.
Use `static` when something is **shared by all objects** or doesn't need an object's data.
`main()` is `static` because Java needs to call it **without creating an object** of the class.


A `static` method can directly access static variables because both belong to the class.
A `static` method **cannot directly access non-static (instance) variables** because those belong to individual objects.
To access a non-static variable inside a static method, you need to create/use an object of that class.
Similarly, a static method can directly call another static method, but not a non-static method without an object.

 */