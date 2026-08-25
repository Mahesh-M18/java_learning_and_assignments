public class pass_by_value {
    static void change(int x) {
        x = 100;
    }

    static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}
/*
the reason why the value of a didn't change is because
a copy of value of a was passed

pass by reference is not possible in java like c/c++
 */