import java.util.Scanner;

public class Find_Nth_term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int prod=1,x=1,ans=0;
        // System.out.println("The "+n+"th number of this series is: "+nterm(n,0,0));
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                prod=prod*x;
                x++;
            }
            ans+=prod;
            prod=1;
        }
        System.out.println(ans);
    }
    public static int nterm(int n,int sum,int idx){

        if(idx==n){
            return sum;
        }
        for(int j=0;j<=n;j++){
            sum+=j;
            return nterm(n, sum, idx+1);
        }
        return 1;
    }
}
