/*
 Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.
 */

import java.util.*;
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        return new pair(min,max);
    }
}
// For reference to Pair in java, https://youtu.be/rQA48u6_UwQ , https://www.geeksforgeeks.org/pair-class-in-java/
//In C++, we have std::pair in the utility library which is of immense use if we want to keep a pair of values together. We were looking for an equivalent class for pair in Java but Pair class did not come into existence till Java 7. JavaFX 2.2 has the javafx.util.Pair class which can be used to store a pair. We need to store the values into Pair using the parameterized constructor provided by the javafx.util.Pair class.
 
//Note : Note that the <Key, Value> pair used in HashMap/TreeMap. Here, <Key, Value> simply refers to a pair of values that are stored together.



