import java.util.Scanner;

public class minPrimeFact {
    public static boolean isprime(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans++;
            }
        }
        if(ans==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=2;
        for(int i=2;i<=n;i++){
            if(n%i==0 && i<=ans && isprime(i)){
                ans=i;
            }
        }
        System.out.println(n-ans);
    }
}
