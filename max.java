// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;
public class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integers that you want the maximum of: {If u enter 0 it will end !}");
        int n=sc.nextInt();
        int max=n;
        while(true)
        {
            if(n!=0)
            {
                n=sc.nextInt();
                if(n>max)
                  max=n;
            }
            else{
                break;
            }
        }
        System.out.println("MAX is : "+max);
    }
}