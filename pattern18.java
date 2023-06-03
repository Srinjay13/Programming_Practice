/* Write a program to print this pattern: (FLOYD'S TRIANGLE) 

       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

*/

import java.util.*;
public class pattern18
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2!=0 && (i!=1))
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }
}