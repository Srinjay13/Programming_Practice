    
/* Write a program to print this pattern:  
        *
       ***
      *****
     *******
    *********

*/
import java.util.*;
public class pattern8
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            // int c=1;
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}