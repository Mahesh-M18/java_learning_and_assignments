public class VariableScope {
    public static void main(String[] args) {
        int a=10;

        if (a>5){
            a=20;
            int b=20;

            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
        //System.out.println(b); //Error because b has local/block scope since it is declared inside the if{} block.
        // whereas a has global scope
    }
}
