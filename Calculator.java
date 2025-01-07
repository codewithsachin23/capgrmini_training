import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to my calculator");
        System.out.println("Enter 1 for Add");
        System.out.println("Enter 2 for Subtract");
        System.out.println("Enter 3 for multi");
        System.out.println("Enter 4 for division");
        int your_choice= sc.nextInt();
        System.out.println("Enter your first number ");
        int a =sc.nextInt();
        System.out.println("Enter your secound number ");
        int b =sc.nextInt();
<<<<<<< HEAD
=======
        if(your_choice==1){
            System.out.println(a+b);
        }

     

>>>>>>> add
    }
}
