/* Write a program to print this pattern:  
       1      1
       12    21
       123  321
       12344321
*/
import java.util.*;
public class pattern20
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for(int spaces=1;spaces<=n-i;spaces++)
            {
                System.out.print("  ");
            }
            for(int spaces=1;spaces<=n-i;spaces++)
            {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}