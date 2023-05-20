import java.util.Scanner;

public class Power_rec{
    public static int p;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the power to which it must be raised: ");
        p=sc.nextInt();
        int power=p;
        int ans=rec(n);
        System.out.println(n+" raised to the power of "+power+" is : "+ans);
    }
    public static int rec(int n){
        if(p==1){
            return n;
        }
        p--;
        return n*rec(n);
    }
    //Another way
    public static int rec(int n,int p){
        if(p==1){
            return n;
        }
        return n*rec(n,p-1);
    }
}