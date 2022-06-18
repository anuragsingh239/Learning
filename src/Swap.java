import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,temp;
        System.out.print("Enter your number :");
        a= sc.nextInt();
        System.out.print("Enter your second number : ");
        b= sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping first number is "+a);
        System.out.println("After swapping second number is "+b);
    }
}
