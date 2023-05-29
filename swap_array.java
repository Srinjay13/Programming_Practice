// Swap two values of any two indices using a function.
import java.util.*;
public class swap_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int ind1,int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
