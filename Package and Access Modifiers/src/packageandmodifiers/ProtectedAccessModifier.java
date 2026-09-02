package packageandmodifiers;

public class ProtectedAccessModifier {
}

/*
package package1;

public class A {

    protected int number = 10;
}


package package1;

public class B {

    public static void main(String[] args) {

        A obj = new A();

        System.out.println(obj.number);
    }
}
 */
// within the same package

/*
package1
   │
   └── A

package2
   │
   └── B extends A

package package1;

public class A {

    protected int number = 10;
}

package package2;

import package1.A;

public class B extends A {

    public void display() {

        System.out.println(number);
    }
}

A
│
│ protected number
│
└─────── extends ───────→ B
                           │
                           ↓
                    can access number
 */