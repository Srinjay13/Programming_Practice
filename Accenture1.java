/*
  ~~~~~~~~~~~~~ Rat Count House ~~~~~~~~~~~~~
(Asked in Accenture OnCampus 10 Aug 2021, Slot 1)

Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2

Output:

4
*/

import java.util.Scanner;

public class Accenture1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int food=r*unit;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=food){
                System.out.println(i+1);
                break;
            }
        }
    }
}