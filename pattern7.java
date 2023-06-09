    
/* Write a program to print this pattern:  
     *****
      ****
       ***
        **
         *

*/

import java.util.*;
public class pattern7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces < i; spaces++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");

            }
            
            System.out.println();
        }
    }
}