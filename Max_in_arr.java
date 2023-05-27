import java.util.Scanner;

// Find the maximum in the given array.
public class Max_in_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int maximum=max(arr);
        System.out.println(maximum);
    }
    public static int max(int[] arr)
    {
        int mx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mx)
                mx=arr[i];
        }
        return mx;
    }
}
