import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Times to loop : ");
        int loop = input.nextInt();

        for (int i=1; i<=loop;i++){
            System.out.println("This is loop number "+i);
        }
        input.close();
    }
}
/*
int i=1 initializaiton
i<=loop condition
i++ increment

break - terminates the loop;
continue - skips the current iteration

Nested Loops
for(){
    for(){

    }
}
 */