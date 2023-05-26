import java.util.Scanner;
public class Reverse_number_rec {
    public static int rev=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n=sc.nextInt();
        System.out.println("The reversed number of "+n+" is: "+rev_no(n));
    }
    public static int rev_no(int n){
        if(n==0)
            return rev;
        rev= rev*10+(n%10);
        return rev_no(n/10);
    }
}
