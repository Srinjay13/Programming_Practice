public class no_of_pyramids {
    public static int count(int n){
        if(n<=1){
            return n;
        }
        int sum=n+(n-1);
        return sum+count(n-1);
    }
    public static void main(String[] args) {
        System.out.println(count(2));
    }
}
