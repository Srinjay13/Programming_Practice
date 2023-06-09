    
/* Write a program to print this pattern:  
         *
        **
       ***
      ****
     *****

*/

import java.util.*;
public class pattern6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            // int c=n-i;
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}