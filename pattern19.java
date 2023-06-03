/* Write a program to print this pattern: (FLOYD'S TRIANGLE) 
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

*/


import java.util.*;
public class pattern19
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >=0 ; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}