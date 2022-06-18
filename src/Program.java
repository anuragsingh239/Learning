import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        n1= sc.nextInt();
        System.out.println("Enter second number");
        n2= sc.nextInt();
        System.out.println("Enter third number");
        n3= sc.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println("Greater number is :"+n1);
        }
        else if(n2>=n1&&n2>=n3)
        {
            System.out.println("Greater number is :"+n2);
        }
        else{
            System.out.println("Greater number is :"+n3);
        }
    }
}
