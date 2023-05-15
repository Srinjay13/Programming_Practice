import java.util.*;
public class Prime_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(isPrime(i))
                    System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count>2)
            return false;
        return true;
    }
}
