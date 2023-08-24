import java.util.Arrays;

public class Max_element {
    public static void main(String[] args) {
        int[] arr={23,45,82,71};
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println("Maximum element: "+max);
        System.out.println("Index: "+ind);
    }
}
