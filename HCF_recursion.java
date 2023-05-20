import java.util.*;
public class HCF_recursion {
    //If we continously keep on dividing the numbers
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
    //If we continously keep on subtracting the smaller number from the larger number 
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
        System.out.println(rec(24,6));
    }
}

