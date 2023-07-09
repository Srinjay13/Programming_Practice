import java.util.Arrays;

public class Merge_sort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[]ans=MS(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] MS(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=MS(Arrays.copyOfRange(arr, 0, mid));
        int[] right=MS(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second) {
        int[] ans=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                ans[k]=first[i];
                i++;
            }
            else{
                ans[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            ans[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            ans[k]=second[j];
            j++;
            k++;
        }

        return ans;
    }
}