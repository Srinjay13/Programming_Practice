import java.util.*;
public class Abundant_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant number");
        }
        */
        //Pal
        perfect_no p=new perfect_no();
        p.main(args);
        int s=p.sum;
        System.out.println(s);
        if(s>n){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant number");
        }
    }
}
