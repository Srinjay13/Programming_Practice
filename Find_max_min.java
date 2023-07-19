public class Find_max_min {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, -5, -4, 8, 6};
        int min=findmin(arr,arr.length);
        int max=findmax(arr,arr.length);
        System.out.println(min);
        System.out.println(max);
    }
    public static int findmin(int[] arr,int n) {
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],findmin(arr,n-1));
    }
    public static int findmax(int[] arr,int n) {
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],findmin(arr,n-1));
    }
}
