import java.util.Scanner;

public class Largest_element_in_array {
    public static int max=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=find_max(arr,0);
        System.out.println("The largest element in the array is: "+ans);
    }
    public static int find_max(int[] arr,int idx){
        if(idx==arr.length)
            return max;
        if(max<arr[idx]){
            max=arr[idx];
        }
        return find_max(arr, idx+1);
    }
}
