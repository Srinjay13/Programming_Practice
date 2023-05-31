/* Write a program to print this pattern:  
*****
*****
*****
*****
*****
*/

import java.util.*;
public class solid_rectangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}