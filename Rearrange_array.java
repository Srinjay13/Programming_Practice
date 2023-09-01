import java.util.Arrays;

public class Rearrange_array{
    public static void main(String[] args) {
        int[] arr={1,-2,5,2,-7,4,-1,3};
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));

        // int i=0,j=0;
        // while(j<arr.length){
        //     if(arr[i]>0 && arr[j]<0){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         i++;
        //         j++;
        //     }
        //     else if(arr[i]>0 && arr[j]>0){
        //         j++;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
    }
}