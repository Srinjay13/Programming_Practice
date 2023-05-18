import java.util.Scanner;

public class number_expressed_as_sum_of_two_primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2)
            System.out.println("Not a prime number");
        else if(n%2!=0){
            System.out.println("Not possible !");
        }else{
        for(int i=2;i<=n/2;i++){
            if(isPrime(i)==1){
                if(isPrime(n-i)==1){
                    System.out.println(n+ " = "+i+" + "+(n-i));
                }
            }
            }
        }
    }
    public static int isPrime(int n){
        if(n==1){
            return 0;
        }
		for(int i = 2 ; i < n ; i++)
		{
			if(n % i == 0)
			{
				return 0;
			}
		}
		return 1;
    }
}
