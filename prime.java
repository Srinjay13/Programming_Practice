import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
        
        //OPTIMIZED WAY{Sieve Of Eratosthenes}-> It gives us all the prime numbers till the given value n
        // int[] isPrime=new int[n+1];
        // for(int i=0;i<=n;i++)
        // {
        //     isPrime[i]=1;
        // }
        // isPrime[0]=0;
        // isPrime[1]=0;
        // for(int i=2;i<Math.sqrt(n);i++){
        //     if(isPrime[i]==1){
        //         for(int j=2;i*j<n;j++){
        //             isPrime[i*j]=0;
        //         }
        //     }
        // }
        // for(int i=2;i<n;i++){
        // if(isPrime[i]==1)
        //     System.out.println(i);
        // }
    }
}