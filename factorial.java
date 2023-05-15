import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int fac=1;
        if(n==0 || n==1)
            System.out.print(n);
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println(fac);*/
        //USing Recursion
        System.out.println(rec(5));
    }
    public static int rec(int n){
        if(n==1)
            return n;
        return rec(n-1)*n;
    }
}
