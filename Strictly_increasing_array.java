public class Strictly_increasing_array {
    public static boolean inc(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return inc(arr,idx+1);
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr={1,2,2,4,5};
        boolean ans=inc(arr,0);
        System.out.println(ans);
    }
}
