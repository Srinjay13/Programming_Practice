public class Sum_of_n_rec {
    public static void main(String[] args) {
        int n=7;
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if(n==0){
            return n;
        }
        return sum(n-1)+n;
    }
}
