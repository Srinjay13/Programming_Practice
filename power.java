// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

import java.util.*;
public class power
{
    static int pow=1;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int pow=1;

        // for(int i=1;i<=b;i++)
        // {
        //     pow=pow*a;
        // }
        // System.out.println(a+" to the power of "+b+" is : "+pow);
        //Using recursion
        System.out.println(pow(a,b,0));

    }
    /*public static int pow(int a,int b){
        if(b>0){
            pow=pow*a;
            return pow(a,b-1);
        }
        return pow;
    }*/
    //Pal
    public static int pow(int a,int b,int i){
        if(i==b){
            return pow;
        }
        pow=pow*a;
        return pow(a,b,i+1);
    }
}