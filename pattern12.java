/* Write a program to print this pattern:  
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

*/
//ami erom try kore6ilam amr code duto die but problem hochilo je ami bujhte par6ina je outer loop duto eksathe ektar por ekta kikore cholle eta output asche ami nijei bujhte parchina ...🥲
import java.util.*;
public class pattern12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //upper half
        for (int i = 1; i < n; i++)//here instead of running it till i<=n ...we do it a less iteration just to delete a row (specifically the last one ) to make the diamond look pointed so that it looks like the question pattern
         {
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
        //lower half

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



//Net er answer(kichu bujh6ina)
// import java.util.Scanner;
// public class pattern12 
// {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter Number of Rows : ");
//         int n = scan.nextInt();
//         //for the upper half
//         for (int i = 1; i<n;i++){
//           for (int j = i; j<=n; j++) {
//              System.out.print("  "); // decreasing
//           }
//           for (int j = 1; j< i; j++) { // increasing
//              System.out.print("* ");
//           }
//           for (int j = 1; j<=i; j++) { // increasing
//              System.out.print("* ");
//           }
//           System.out.println();
//        }

//        //for the lower half
//        for (int i = 1; i<=n ; i++) {

//           for (int j = 1; j<=i; j++) { // increasing
//              System.out.print("  ");
//           }
//           for (int j = i; j< n; j++) { // decreasing
//              System.out.print("* ");
//           }
//           for (int j = i; j<=n; j++) { // decreasing
//              System.out.print("* ");
//           }
//           System.out.println();
//        } 
// }
// }