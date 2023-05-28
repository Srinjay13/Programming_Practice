/*
 Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

 

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 

Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N and S as input parameters and returns an arraylist containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting only one element that is -1.

 
 */

//Naive approach 
// import java.util.Scanner ;    
// class arrays10 {  
//     /* If our function subarray seems to be successful in finding any subarray whose sum of elements matches with the given sum value, then we will print the resulting Subarray, else we will return -1.*/  
//     static int subarray(int arr[] , int n , int sum )  
//     {  
//         int currentsum, i , j ;  
//         // start array with the initial index try all subarrays starting with  ' i '  
  
//         for ( i = 0 ; i < n ; i++ ) {  
//             currentsum = arr[ i ] ;  
//             for (j = i + 1 ; j <= n ; j++) {  
//                 if (currentsum == sum) {  
//                     int p = j - 1 ;  
//                     System.out.println(  
//                         " Sum found between indexes  " + i  
//                         + " and " + p) ;  
//                     return 1 ;  
//                 }  
//                 if (currentsum > sum || j == n)  
//                     break ;  
//                 currentsum = currentsum + arr[j] ;  
//             }  
//         }  
  
//         System.out.println(" No subarray found " ) ;  
//         return 0 ;  
//     }  
  
//     public static void main( String[] args )  
//     {  
//         int n ;  
//  Scanner sc = new Scanner ( System.in ) ;   
//  System.out.println ( " Enter number of elements :  " ) ;  
//  n = sc.nextInt() ;  
//  int [] array = new int[ 100 ] ;  
//  System.out.println ( " Enter elements of the array :  " ) ;  
//  for ( int i = 0 ; i < n ; i++ )  
//  {  
//      array[ i ] = sc.nextInt() ;  
//  }  
//  System.out.println( " Enter value of sum : " ) ;  
//  int sum = sc.nextInt() ;  
//  subarray( array , n , sum ) ;  
//     }  
// }  



//OPTIMAL SOLUTION  

import java.util.Scanner ;    
class arrays10 {  
    /* Returns true if the there is a 
subarray of arr[] with a sum equal to 
    'sum' otherwise returns false. 
Also, prints the result */  
    static int subarray(int arr[], int n, int sum)  
    {  
        int currentsum = arr[0], begin = 0, i;  
   
        // Always start with the initial index of an array  
        for (i = 1; i <= n; i++) {  
            // If currentsum exceeds the sum,  
            // then remove the starting elements  
            while (currentsum > sum && begin < i - 1) {  
                currentsum = currentsum - arr[begin];  
                begin++;  
            }  
   
            // If currentsum becomes equal to sum,  
            // then return true  
            if (currentsum == sum) {  
                int p = i - 1;  
                System.out.println(  
                    "Sum found between indexes " + begin  
                    + " and " + p);  
                return 1;  
            }  
   
            // Add this element to currentsum  
            if (i < n)  
                currentsum = currentsum + arr[i];  
        }  
   
        System.out.println("No subarray found");  
        return 0;  
    }  
  
    public static void main(String[] args)  
    {  
        int n ;  
 Scanner sc = new Scanner ( System.in ) ;  
 System.out.println ( " Enter number of elements :  " ) ;  
 n = sc.nextInt() ;  
 int [] array = new int[ 100 ] ;  
 System.out.println ( " Enter elements of the array :  " ) ;  
 for ( int i = 0 ; i < n ; i++ )  
 {  
     array[ i ] = sc.nextInt() ;  
 }  
 System.out.println( " Enter value of sum : " ) ;  
 int sum = sc.nextInt();  
 subarray( array , n , sum ) ;  
    }  
}  
