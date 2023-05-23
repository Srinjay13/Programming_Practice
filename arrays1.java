// Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array items you want: ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the array elements one after the another: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
