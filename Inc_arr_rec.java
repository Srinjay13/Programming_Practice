public class Inc_arr_rec{
    public static void main(String[] args) {
        int[] arr={20,21,45,89,89,90};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return check(arr, i+1);
        }
        else{
            return false;
        }
        
    }
}