package packageandmodifiers;

public class PrivateAccessModifier {

    private int marks;

    public void setMarks(int marks) {

        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

/*
inside this private_modifier class we can access marks variable/this.marks=marks but from
another class we can't

private variable
      ↓
cannot access directly
      ↓
public getter/setter
      ↓
controlled access
 */