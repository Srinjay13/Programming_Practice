import java.util.Arrays;

public class Merge_sort_inplace {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        MSInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void MSInplace(int[] arr,int s,int e) {
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        MSInplace(arr, 0, mid);
        MSInplace(arr, mid,e);

        mergeInplace(arr,s,mid,e);
    }
    public static void mergeInplace(int[] arr,int s,int m,int e) {
        int[] ans=new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<ans.length;l++){
            arr[l+s]=ans[l];
        }
    }
}
