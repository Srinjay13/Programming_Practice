    
/* Write a program to print this pattern:  
         *
        * *
       *   *
      *     *
     *********
*/

import java.util.*;
public class pattern13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            // int c=1;
            if(i!=n)
            {
                for (int spaces = 1; spaces <= n-i; spaces++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <=2*i-1 ; j++) {
                    if(j%2!=0 && ((j==1) || (j==2*i-1)))
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }
            }
            else
            {
                for (int spaces = 1; spaces <= n-i; spaces++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <=2*i-1; j++) {
                    System.out.print("* ");
                    
                }
            }
            
            
            System.out.println();
        }
    }
}