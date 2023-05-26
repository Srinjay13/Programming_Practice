import java.util.Scanner;

public class Prime_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isPrime(2,n)){
            System.out.println("Prime number !");
        }
        else{
            System.out.println("Not a prime number !");
        }
    }
    public static boolean isPrime(int idx,int n) {
        if(n==2){
            return true;
        }
        if(idx==n/2)
            return true;
        if(n%idx==0)
            return false;
        return isPrime( idx+1, n);
        
    }
}
