// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 


import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        int next=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n;i++)
        {
            
            next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }

    }
}