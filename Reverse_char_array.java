import java.util.Arrays;

public class Reverse_char_array {
    public static void main(String[] args) {
        String s="nilanjan";
        String ans=revString(s);
        // System.out.println(ans);
        char[] arr={'h','e','l','l','o'};
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(char[] arr,int low,int hi){
        if(low>hi){
            return;
        }
        char temp=arr[low];
        arr[low]=arr[hi];
        arr[hi]=temp;
        rev(arr,low+1,hi-1);
    }
    public static String revString(String s) {
        if(s.isEmpty()){
            return s;
        }
        return revString(s.substring(1))+s.charAt(0);
        
    }
}
