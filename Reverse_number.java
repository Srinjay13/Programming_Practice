import java.util.*;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        /*int rem=0,rev=0;
        while(n!=0){
            rem=n%10;
            //System.out.print(rem);
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);*/
        //USING RECURSION
        System.out.println(rec(0,n));

    }
    public static int rec(int rev,int n){
        if(n==0)    
            return rev;
        rev=rev*10+n%10;
        return rec(rev,n/10);
    }
}
