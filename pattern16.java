/*
Write a program to print the pattern:(Don't know how the actual solution is)
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
*/ 
import java.util.*;
public class pattern16
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if((j==1) || (j==2*i-1))
                    System.out.print("1 ");
                else if(j%2!=0 &&(i==3))
                    System.out.print("2 ");
                else if(j%2!=0 &&(i==4))
                    System.out.print("3 ");
                else if(j%2!=0 &&(i==5))
                    System.out.print("4 ");
                else if(j==5 &&(i==5))
                    System.out.print("6 ");
                else
                    System.out.print("  ");
            }            
            System.out.println();
        }
    }
}