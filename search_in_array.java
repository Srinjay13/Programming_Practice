// Take an array as input from the user.Search for a given number x and print the index at which it occurs.
import java.util.Scanner;
public class search_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array items you want: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements one after the another: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Now enter the number you want to search for: ");
        int num=sc.nextInt();
        for (int index = 0; index < n; index++) {
            if(arr[index]==num)
            {
                System.out.println("This item is in the index: "+(index+1));
            }
        }
    }
}
