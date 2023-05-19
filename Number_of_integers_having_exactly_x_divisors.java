import java.util.Scanner;

public class Number_of_integers_having_exactly_x_divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int count=0,ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==x){
                ans++;
            }
            count=0;
        }
        System.out.println(ans);
    }
}