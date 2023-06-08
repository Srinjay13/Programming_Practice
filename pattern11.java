
/* Write a program to print this pattern:  
     * * * * *
      * * * *
       * * *
        * *
         *
*/

import java.util.*;
public class pattern11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = n; i >=1; i--) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}