import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,res;
        System.out.println("Enter first number :");
        num1= sc.nextInt();
        System.out.println("Enter second number :");
        num2=sc.nextInt();
        System.out.println("Select a symbol (+,-,*,/)");
        String sym=sc.next();
        switch (sym)
        {
            case "+"  :res=num1+num2;
                System.out.println("Addition of given number :"+res);
                break;
            case "-":res=num1-num2;
                System.out.println("Difference of given number :"+res);
                break;
            case "*":res=num1*num2;
                System.out.println("Product of given number :"+res);
                break;
            case "/":res=num1/num2;
                System.out.println("Division of given number :"+res);
                break;
            default:
                System.out.println("Invalid symbol used");
        }
    }
}
