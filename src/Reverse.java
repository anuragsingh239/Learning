import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem,rev = 0;
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of Number is "+rev);
    }
}
