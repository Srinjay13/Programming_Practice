/* Write a program to print this pattern:  
*****
****
***
**
*

*/

import java.util.*;
public class pattern3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 0; i < n; i++) {
            // int c=n-i;
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}