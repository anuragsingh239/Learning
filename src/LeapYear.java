import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :");
        year= sc.nextInt();
        if((year%4==0) &&(year%100!=0) || (year%400==0)){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
}
