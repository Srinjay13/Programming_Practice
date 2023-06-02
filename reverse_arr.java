// Reverse the given array.
// Swap two values of any two indices using a function.
// import java.util.*;
// public class reverse_arr {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//         reverse(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void reverse(int[] arr)
//     {
//         int start=0;
//         int end=arr.length-1;
//         //Using the two pointer approach
//         while(start<end)
//         {
//             swap(arr,start,end);
//             start++;
//             end--;
//         }
//     }
//     public static void swap(int[] arr,int ind1,int ind2)
//     {
//         int temp=arr[ind1];
//         arr[ind1]=arr[ind2];
//         arr[ind2]=temp;
//     }
// }


/*package whatever //do not write package name here */
//Etae output bhul diche ...janina kno?
import java.util.*;


class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int start=0;
		    int end=n-1;
		    int temp=0;
		    while(start<=end)
		    {
		        temp=arr[start];
		        arr[start]=arr[end];
		        arr[end]=temp;
		        start++;
		        end--;
		    }
		    System.out.print(Arrays.toString(arr));
		}
		System.out.println();
	}
}

//We can also solve it using Recursion -
// class GFG {
    // 	public static void main (String[] args){
    // 		Scanner scan = new Scanner(System.in);
    // 		int T = scan.nextInt();
            
    // 		while(T != 0){
    // 		    int N = scan.nextInt();
    //     		int A[] = new int[N];
    //     		for(int i = 0; i < N; i++){
    //     		    A[i] = scan.nextInt();
    //     		}
    //             reverse(A, N-1);
    //             T--;
    //             System.out.println();
    // 		}    
    // 	}
    // 	private static void reverse(int[] nums, int j){
    // 	    if(j < 0){
    // 	        return;
    // 	    }
    // 	    System.out.print(nums[j] +" ");
    // 	    reverse(nums, j-1);
    // 	}
    // }