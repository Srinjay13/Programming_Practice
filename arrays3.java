// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.
import java.util.*;
public class arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array items you want: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int cnt=0;
        System.out.println("Enter the array elements one after the another: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i]<arr[i+1])
                cnt++;
        }
        if(cnt==n-1)
        {
            System.out.println("It is in ascending order!");
        }
        else
        {
            System.out.println("It is not in ascending order!");
        }
    }
}
