import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Which operation do you want to perfrom +,-,*,%");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.println("sum of two numbers is:" + (a+b));
            break;

            case '-':
            System.out.println("difference of two numbers is:" + (a-b));
            break;

            case '*':
            System.out.println("product of two numbers is:" + (a*b));
            break;


            case '%':
            System.out.println("dision of two numbers is:" + (a%b));
            break;

            default:
            System.err.println("you entered a wrong number");
        }
    }
    
}
