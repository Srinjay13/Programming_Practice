import java.util.*;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=2*fact(n-2);
        int ncr=fact(n)/s;
        /*int num = 10;
        int total = num * (num-1) / 2;*/
        System.out.println("Minimum no. of Handshakes: "+ncr);
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
