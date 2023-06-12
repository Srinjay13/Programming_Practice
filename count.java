// Write a program to check how many times a specific number arrives in a given integer.

import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int on=n,count=0,c=0;
        int rem=0;
        int dup=n;
        while(on>0)
        {
            on=on/10;
            count++;
        }
        for(int i=0;i<count;i++)
        {
            rem=dup%10;
            dup=dup/10;
            if(rem==num)
                c++;
        }
        System.out.println("The number "+num+" arrives "+c+" times in the integer : "+n);
    }
}