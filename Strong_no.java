import java.util.*;
public class Strong_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int rem=0,sum=0;
        while(num!=0){
            rem=num%10;
            sum+=fact(rem);
            num=num/10;
        }
        if(sum==n)
            System.out.println("Strong number");
        else{
        System.out.println("Not a Strong number");
        }
    }
    public static int fact(int n){
        int fac=1;
        if(n==0 || n==1)
            return n;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
}
