import java.util.Scanner;

public class Prime_number_in_a_range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.print(i+" " );
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
