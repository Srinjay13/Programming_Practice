// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class sum_of_even_and_odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int even=0,odd=0;
        int len=0;
        while(num>0)
        {
            num=num/10;
            len++;
        }
        for(int i=0;i<=len;i++)
        {
            if(i%2==0)
                even+=i;
            else
                odd+=i;
        }
        System.out.println("Addition of all the even digits are: "+even);
        System.out.println("Addition of all the odd digits are: "+odd);
    }
}