import java.util.*;
public class GCD {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
 
        return gcd(b % a, a);
    }
    public static int hcf(int n1,int n2){
        if(n1==0)
            return n2;
        if(n2==0)
            return n1;
        while(n1!=n2){
            // if(n1==n2)
            //     return n1;
            if(n1>n2)
                n1-=n2;
            else 
                n2-=n1;
        }
        return n1;
    }
    public static int rec(int n1,int n2){
        if(n1==0)
            return n2;
        if(n2==0)
            return n1;
        
        if(n1==n2)
            return n1;
        
        if(n1>n2)
            return rec(n1-n2,n2);
        return rec(n1,n2-n1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=0;
        for(int i=1;i<n1 || i<n2;i++){
            if(n1%i == 0 && n2%i == 0){
                hcf=i;
            }
        }
        System.out.println(hcf);
        //2nd Way(Euclidean)
        */
        System.out.println(rec(24,6));
    }
}
