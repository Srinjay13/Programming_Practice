
/* Write a program to print this pattern:  
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/

import java.util.*;
public class pattern5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i < 2*n; i++) {
            // int c=n-i;
            if(i<n)
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else 
            {
                for(int j = 1; j <= 2*n-i; j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}