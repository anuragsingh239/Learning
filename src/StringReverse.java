import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String rev="";
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string to reverse :");
        String str=s.next();
        for(int i=str.length()-1;i>=0;i--){
            rev=rev + str.charAt(i);

        }
        System.out.println("Reverse string is : "+rev);

    }

}
