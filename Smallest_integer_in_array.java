import java.util.Scanner;
public class Smallest_integer_in_array {
    public static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=find_min(arr,0);
        System.out.println("The smallest element in the array is: "+ans);

    }
    public static int find_min(int[] arr,int idx){
        if(idx==arr.length)
            return min;
        if(min>arr[idx]){
            min=arr[idx];
        }
        return find_min(arr, idx+1);
    }
}
