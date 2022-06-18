import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int temp=0;
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        num= sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                temp=temp+1;
            }

        }
        if(temp>0){
            System.out.println("Number is not prime ");
        }
        else{
            System.out.println("Number is Prime ");
        }
    }
}
