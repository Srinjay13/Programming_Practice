import java.util.*;
public class Fibonacci_series {
    static int a=0,b=1,temp;
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    /*int[] arr=new int[n];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    for(int i=0;i<n;i++){
        if(i==n-1){
            System.out.print(arr[i]);
        }else{
        System.out.print(arr[i]+" , ");
        }
    }*/
    /*int a=0;
    int b=1;
    int temp=0;
    System.out.print(a);
    System.err.print(b);
    for(int i=0;i<n-2;i++){
        temp=a+b;
        a=b;
        b=temp;
        System.out.print(temp);
    } */
    //Using Recursion
    int a=0,b=1;
    System.out.print(a+" , ");
    System.out.print(b+" , ");
    fb(0,1,3);
   } 
   public static int rec(int n){
    if(n>0){
        temp=a+b;
        a=b; 
        b=temp;
        System.out.print(temp+" , ");
        rec(n-1);
    }
    return 1;
}

public static void fb(int a, int b, int n){
    if(n==0){
    return;
    }
    int c=a+b;
    System.out .print(c+" , ");
    fb( b,c, n-1);
    }

}
