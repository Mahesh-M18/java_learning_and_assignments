package packageandmodifiers;

class DefaultAccessModifier {

    int number = 10;

    void display() {
        System.out.println(number);
    }
}

/*

accessible only within the same package
src
│
├── package1
│   ├── A.java
│   └── B.java
│
└── package2
    └── C.java

B can access A and vice versa
C cannot access B or A
 */

/*
a top-level class can only be :
public or default
 */