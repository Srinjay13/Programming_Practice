import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int sum=0,rem=0;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum is:"+sum);*/
        //Using Recursion
        System.out.println(rec(n, 0));
        /*Paul ei bhabe korechilo
        int sum = 0;
        String n = sc.next();
        for (int i=0;i<n.length();i++){
            sum += (Integer.valueOf(""+n.charAt(i)));
            // or we can use
            // sum += n.charAt(i) - 48;
        }
        System.out.println(sum);*/
    }
    public static int rec(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum+=n%10;
        return rec(n/10,sum);
    }
}
