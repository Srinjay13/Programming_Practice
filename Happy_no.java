import java.util.*;
public class Happy_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(happy(n)==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not a happy number");
        }
    }
    public static int happy(int n){
        if(n==1){
            return n;
        }
        int rem=0,sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return happy(sum);
    }
}
