import java.util.*;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int dup=n;
        int len=0,rem=0;
        while(n!=0){
            n=n/10;
            len++;
        }
        /*while(num!=0){
            rem=num%10;
            sum+=Math.pow(rem,len);
            num=num/10;
        }
        if(dup==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }*/
        //Using Recursion
        System.out.println(rec(0,num,len));
    }
    public static int rec(int sum,int n,int len){
        if(n==0){
            return sum;
            
        }
        sum+=(int)Math.pow(n%10,len);
        return rec(sum,n/10,len);
    }
}

