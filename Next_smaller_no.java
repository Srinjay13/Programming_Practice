import java.util.Arrays;

public class Next_smaller_no {
    public static int[] mome(int[] arr){
        int next;
        int[] ans=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            ans[k]=next;
            k++;
        }
        // System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        // int[] arr={3,2,11,7,6,5,6,1};
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(mome(arr)));
    }
}
